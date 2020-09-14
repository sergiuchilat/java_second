package polimorphism;

public class Train extends Transport{
    public String name = "Train";
    @Override
    public void run() {
        System.out.println("Train run");
    }
}
