public class Car {
    public Car(Integer maxSpeed){
        this.maxSpeed = maxSpeed;
    }
    private String name;
    private Integer speed;
    private final Integer maxSpeed;

    public void startEngine(Integer initialSpeed){
        this.speed = initialSpeed;
        System.out.println("Engine started");
    }

    public void speedUp(Integer delta) {
        if(this.speed + delta > this.maxSpeed) {
            System.out.println("Warning. Max speed exceeded");
            return;
        }
        this.speed += delta;
        System.out.println("Speed up by " + delta.toString());
    }

    public void speedDown(Integer delta) {
        this.speed = Math.max(this.speed - delta, 0);
        System.out.println("Speed down by " + delta.toString());
    }

    public void stopEngine() {
        System.out.println("Engine stopped");
        this.speed = 0;
    }

    public int getSpeed() {
        return this.speed;
    }
}
