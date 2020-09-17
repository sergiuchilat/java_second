package polimorphism;

abstract public class Transport {
    public String name = "Some transport";

    public String getName() {
        return name;
    }

    public void run(){
        System.out.println("Some transport run");
    }
}
