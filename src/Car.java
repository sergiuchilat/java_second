public class Car {
    private String name;
    private Integer speed;

    public void startEngine(Integer initialSpeed){
        this.speed = initialSpeed;
        System.out.println("Engine started");
    }

    public void speedUp(Integer delta) {
        this.speed += delta;
        System.out.println("Speed up by " + delta.toString());
    }

    public void speedDown(Integer delta) {
        this.speed -= delta;
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
