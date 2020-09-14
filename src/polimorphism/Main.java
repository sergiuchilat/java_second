package polimorphism;

public class Main {
    public static void main(String[] args) {
        Transport[] transports = new Transport[10];
        transports[0] = new Car();
        transports[1] = new Car();
        transports[2] = new Train();
        transports[3] = new Car();
        transports[4] = new Ship();
        transports[5] = new Car();

        for (Transport transport: transports) {
            if(transport != null){
                System.out.println(transport.name);
                transport.run();
            }
        }
    }
}
