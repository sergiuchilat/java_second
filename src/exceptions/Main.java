package exceptions;

public class Main {
    public static void main(String[] args) {
        System.out.println("test");
        int x = 20;
        int y = 0;

        try {
            System.out.println(x / y);
        } catch (Exception e){
            System.out.println(e.toString());
        } finally {
            System.out.println("END");
        }
    }
}
