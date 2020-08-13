public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine(3);
        System.out.println("Current speed is " + car.getSpeed());
        car.speedUp(2);
        System.out.println("Current speed is " + car.getSpeed());
        car.speedDown(3);
        System.out.println("Current speed is " + car.getSpeed());
        car.stopEngine();
        System.out.println("Current speed is " + car.getSpeed());
    }
}
