import Lesson9.*;
public class Lesson9 {
    public void run() {

        Rabbit rabbit = new Rabbit("Bugs Bunny");
        Lion lion = new Lion("Lion King");

        System.out.println("Rabbit name is: " + lion.getName());
        System.out.println("Rabbit eat: " + rabbit.eat());

        System.out.println("Lion is: " + (lion.isAlive() ? "alive": "dead"));
        System.out.println("Rabbit is: " + (rabbit.isAlive() ? "alive": "dead"));

        System.out.println("Lion name is: " + lion.getName());
        System.out.println("Lion eat: " + lion.eat());
        if(lion.eat() == "rabbit") {
            rabbit.die();
        }

        System.out.println("Lion is: " + (lion.isAlive() ? "alive": "dead"));
        System.out.println("Rabbit is: " + (rabbit.isAlive() ? "alive": "dead"));
    }
}
