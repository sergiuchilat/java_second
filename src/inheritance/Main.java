package inheritance;

public class Main {
    public static void main(String[] args) {
        /*Animal animal = new Animal("Animal 1", 2);
        System.out.println("Animal name " + animal.getName());
        animal.move();
        animal.move();
        animal.move();*/


        Lion lion = new Lion("Simba", 5);

        System.out.println("Lion name " + lion.getName());
        lion.move();
        lion.move();
        lion.move();

        Fish fish = new Fish("Nemo");
        System.out.println("Fish name " + fish.getName());
        fish.move();
    }
}
