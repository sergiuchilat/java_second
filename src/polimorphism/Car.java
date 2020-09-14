package polimorphism;

public class Car extends Transport{
    public String name = "Car";
    @Override
    public void run() {
        System.out.println("Car run");
    }
}
