public class Main {
    public static void main(String[] args) {
        Car toyotaCar = new Car("Toyota", 240, 6.7F);
        toyotaCar.setPrice(9999.9999);
        toyotaCar.setSeats((byte) 7);
        System.out.println("[" + toyotaCar.getName() + "] has " + toyotaCar.getSeats() + " seats");
        toyotaCar.startEngine(3);
        System.out.println("[" + toyotaCar.getName() + "] Current speed is " + toyotaCar.getSpeed());
        toyotaCar.speedUp(2);
        System.out.println("[" + toyotaCar.getName() + "] Current speed is " + toyotaCar.getSpeed());
        toyotaCar.speedDown(3);
        System.out.println("[" + toyotaCar.getName() + "] Current speed is " + toyotaCar.getSpeed());
        toyotaCar.stopEngine();
        System.out.println("[" + toyotaCar.getName() + "] Current speed is " + toyotaCar.getSpeed());

        Car bmwCar = new Car("BMW", 240, 11.3F);
        bmwCar.startEngine(2);
        bmwCar.setPrice(19999.333333);
        System.out.println("[" + bmwCar.getName() + "] has " + bmwCar.getSeats() + " seats");
        System.out.println("[" + bmwCar.getName() + "] Current speed is " + toyotaCar.getSpeed());
        bmwCar.speedUp(2);
        System.out.println("[" + bmwCar.getName() + "] Current speed is " + toyotaCar.getSpeed());
        bmwCar.speedDown(3);
        System.out.println("[" + bmwCar.getName() + "] Current speed is " + toyotaCar.getSpeed());
        bmwCar.stopEngine();
        System.out.println("[" + bmwCar.getName() + "] Current speed is " + toyotaCar.getSpeed());

        System.out.print("Price difference between [" + toyotaCar.getName() + "] and " + bmwCar.getName() + "] is "  );
        System.out.println(bmwCar.getPrice() - toyotaCar.getPrice());
    }
}
