public class Main {
    public static void main(String[] args) {
        Car toyotaCar = new Car("Toyota", 240);
        toyotaCar.startEngine(3);
        System.out.println("[" + toyotaCar.getName() + "] Current speed is " + toyotaCar.getSpeed());
        toyotaCar.speedUp(2);
        System.out.println("[" + toyotaCar.getName() + "] Current speed is " + toyotaCar.getSpeed());
        toyotaCar.speedDown(3);
        System.out.println("[" + toyotaCar.getName() + "] Current speed is " + toyotaCar.getSpeed());
        toyotaCar.stopEngine();
        System.out.println("[" + toyotaCar.getName() + "] Current speed is " + toyotaCar.getSpeed());

        Car bmwCar = new Car("BMW", 240);
        bmwCar.startEngine(2);
        System.out.println("[" + bmwCar.getName() + "] Current speed is " + toyotaCar.getSpeed());
        bmwCar.speedUp(2);
        System.out.println("[" + bmwCar.getName() + "] Current speed is " + toyotaCar.getSpeed());
        bmwCar.speedDown(3);
        System.out.println("[" + bmwCar.getName() + "] Current speed is " + toyotaCar.getSpeed());
        bmwCar.stopEngine();
        System.out.println("[" + bmwCar.getName() + "] Current speed is " + toyotaCar.getSpeed());
    }
}
