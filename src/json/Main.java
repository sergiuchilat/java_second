package json;

public class Main {
    public static void main(String[] args) {
        System.out.println("test json");
        int t = 1;
        System.out.println(switch (t) {
            case 1 -> 2;
            default -> 0;
        });
    }
}
