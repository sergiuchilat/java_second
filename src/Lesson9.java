import Lesson9.*;
public class Lesson9 {
    public void run() {

        boolean lionWillMove = true;

        Rabbit rabbit = new Rabbit("Bugs Bunny");
        Lion lion = new Lion("Lion King", 25);

        System.out.println("Lion name is: " + lion.getName());
        System.out.println("Lion age is: " + lion.getAge());
        System.out.println("Lion eat: " + lion.whatEat());

        System.out.println("Rabbit name is: " + rabbit.getName());
        System.out.println("Rabbit age is: " + rabbit.getAge());
        System.out.println("Rabbit eat: " + rabbit.whatEat());

        System.out.println("Lion is: " + (lion.isAlive() ? "alive": "dead"));
        System.out.println("Rabbit is: " + (rabbit.isAlive() ? "alive": "dead"));

        System.out.println("Lion name is: " + lion.getName());
        System.out.println("Lion eat: " + lion.whatEat());


        if(lionWillMove){
            lion.move();
            System.out.println("Lion move");
        }

        if(lion.isHungry()){
            lion.eat();
            System.out.println("Lion eat");
            if(lion.whatEat().equals("rabbit")) {
                rabbit.die();
                System.out.println("Rabbit died");
            }
        }


        System.out.println("Lion is: " + (lion.isAlive() ? "alive": "dead"));
        System.out.println("Rabbit is: " + (rabbit.isAlive() ? "alive": "dead"));
    }
}
