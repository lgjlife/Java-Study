package test;

public class ThreadDemo {

    public static void main(String args[]){

        for(int i = 0; i< 10; i++){

            new Thread(){

                @Override
                public void run() {

                    while (true){
                        try{
                            Thread.sleep(1);
                        }
                        catch(Exception ex){

                        }


                        for(int j = 0; j < 100000000; j++){

                        }
                    }
                }
            }.start();
        }
    }
}
