package offer.string;

public class ReplaceStr {

    public static void main(String args[]){

       String result =  replace("Hello wang","ABC");

        System.out.println(result);
    }

    public static  String replace(String ori,String replaceTo){

        byte[] blankByte = " ".getBytes();
        int blankByteCount = 0 ;
        byte[] oriByte = ori.getBytes();
        byte[] replaceToByte = replaceTo.getBytes();


        for(int i = 0; i< oriByte.length; i++){

            if(oriByte[i] == blankByte[0]){
                blankByteCount++;
            }
        }

        int length = oriByte.length + blankByteCount * replaceToByte.length-blankByteCount;
        byte[] result = new byte[length];

        int indexOfNew  =  length-1;
        int indexOfOrig  =  oriByte.length-1;
        while( (indexOfNew >= 0) && (indexOfOrig >= 0)){

            System.out.println("indexOfNew = " + indexOfNew);
           if(oriByte[indexOfOrig] == blankByte[0]){
               System.out.println("===");
               int indexReplaceToByte = replaceToByte.length-1;
               while (indexReplaceToByte >= 0){
                   result[indexOfNew--] = replaceToByte[indexReplaceToByte--];
               }
               indexOfOrig--;
           }
           else {
               result[indexOfNew--] = oriByte[indexOfOrig--];
           }
        }

        return new String(result);

    }
}
