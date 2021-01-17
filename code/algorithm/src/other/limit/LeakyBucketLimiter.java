package other.limit;

import java.util.concurrent.ConcurrentHashMap;

public class LeakyBucketLimiter {


    private static ConcurrentHashMap<String,LeakyBucket> map = new ConcurrentHashMap<>();


    private class LeakyBucket{
        //漏桶最大容量
        private int cap;
        //剩余容量
        private int remaind;
        //每秒允许的数量，漏斗留出的速率
        private float rate;

        private long lastTime = System.currentTimeMillis();

        public LeakyBucket(int cap,int count,int persecond) {
            this.cap = cap;
            this.remaind = cap;
            rate = (float)count/(1000*persecond);
        }

        public void makeSpace(){

             long cur = System.currentTimeMillis();
             long diff = cur - lastTime;

             int  leaked = (int)(diff * rate);

             if(leaked < 0){

                 this.remaind = cap;
                 this.lastTime = cur;
                 return;
             }

             else if(leaked < 1){
                 return;
             }

             this.remaind += leaked;
             this.lastTime = cur;

             if(this.remaind > this.cap){
                 this.remaind = this.cap;
             }


        }

        public boolean watering(int quota){
            makeSpace();
            if(this.remaind >= quota){
                this.remaind -= quota;
                return  true;
            }

            return false;
        }

        @Override
        public String toString() {
            return "LeakyBucket{" +
                    "cap=" + cap +
                    ", remaind=" + remaind +
                    ", rate=" + rate +
                    ", lastTime=" + lastTime +
                    '}';
        }
    }

    public boolean isAllow(String name ,String nextKey,int cap,int count,int persecons){


        String key = String.format("%s:%s",name,nextKey);

        if(null == map.get(key)){
            map.put(key,new LeakyBucket(cap,count,persecons));
        }



        LeakyBucket leakyBucket = map.get(key);

        return leakyBucket.watering(5);

    }


    public static void main(String args[]) throws Exception{
        LeakyBucketLimiter limiter = new LeakyBucketLimiter();

        int testAccessCount = 30;
        int capacity = 30;
        int allowQuota = 5;
        int perSecond = 1;
        int allowCount = 0;
        int denyCount = 0;
        for (int i = 0; i < testAccessCount; i++) {
            boolean isAllow = limiter.isAllow("dadiyang", "doSomething", capacity, allowQuota, perSecond);
            if (isAllow) {
                allowCount++;
            } else {
                denyCount++;
            }
            System.out.println("访问权限：" + isAllow);
            Thread.sleep(1000);
        }
        System.out.println("报告：");
        System.out.println("漏斗容量：" + capacity);
        System.out.println("漏斗流动速率：" + allowQuota + "次/" + perSecond + "秒");

        System.out.println("测试次数=" + testAccessCount);
        System.out.println("允许次数=" + allowCount);
        System.out.println("拒绝次数=" + denyCount);


    }
}
