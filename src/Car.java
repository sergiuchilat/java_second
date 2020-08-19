public class Car {
    public Car(String name, Integer maxSpeed, Float fuelConsumption){
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.fuelConsumption = fuelConsumption;
    }
    private final String name;
    private int speed;
    private final Integer maxSpeed;
    private float fuelConsumption = 0.0F;
    private double price = 0.0;
    private byte seats = 5;

    public void setPrice(Double price){
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }
    public void setSeats(Byte seats) {
        this.seats = seats;
    }

    public Byte getSeats(){
        return this.seats;
    }

    public void startEngine(Integer initialSpeed){
        this.speed = initialSpeed;
        System.out.println("[" + this.name + "] Engine started");
        System.out.println("[" + this.name + "] consuming " + this.fuelConsumption +" liters/100km");
    }

    public void speedUp(Integer delta) {
        if(this.speed + delta > this.maxSpeed) {
            System.out.println("[" + this.name + "] Warning. Max speed exceeded");
            return;
        }
        this.speed += delta;
        System.out.println("[" + this.name + "] Speed up by " + delta.toString());
    }

    public void speedDown(Integer delta) {
        this.speed = Math.max(this.speed - delta, 0);
        System.out.println("[" + this.name + "] Speed down by " + delta.toString());
    }

    public void stopEngine() {
        System.out.println("[" + this.name + "] Engine stopped");
        this.speed = 0;
    }

    public int getSpeed() {
        return this.speed;
    }

    public String getName() {
        return this.name;
    }

}
