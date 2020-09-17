package polimorphism;

public class Car extends Transport{
    public String name = "Car";
    @Override
    public void run() {
        this.name = "Car";
        System.out.println("Car run");
    }

    @Override
    public String getName() {
        return name;
    }
}
