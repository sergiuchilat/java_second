public class Car {
    public Car(String name, Integer maxSpeed){
        this.name = name;
        this.maxSpeed = maxSpeed;
    }
    private String name;
    private Integer speed;
    private final Integer maxSpeed;

    public void startEngine(Integer initialSpeed){
        this.speed = initialSpeed;
        System.out.println("[" + this.name + "] Engine started");
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
