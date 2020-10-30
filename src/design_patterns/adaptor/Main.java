package design_patterns.adaptor;

public class Main {
    public static void main(String[] args) {
        AritmeticaAdaptor aritmeticaAdaptor = new AritmeticaAdaptor();
        System.out.println(aritmeticaAdaptor.add(4, 3));
    }
}
