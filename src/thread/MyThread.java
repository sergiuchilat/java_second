package thread;

public class MyThread extends Thread {
    public void run(){
        System.out.println("Code running in thread");
        final int max = 20;
        for (int i = 1; i <= max; i++){
            System.out.print(i);
            if(i < max){
                System.out.print(", ");
            }
        }
        System.out.println("");
        System.out.println("END");
        System.out.println("");
    }
}
