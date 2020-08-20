package Lesson9;

abstract public class Animal {
    private final String name;
    private boolean hungry = false;
    protected String eatWhat = "everything";
    protected boolean alive = true;
    protected int age = 0;

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String whatEat(){
        return eatWhat;
    }

    public void die(){
        this.alive = false;
    }

    public void eat(){
        this.hungry = false;
    }

    public void move(){
        this.hungry = true;
    }

    public boolean isAlive() {
        return this.alive;
    }

    public boolean isHungry(){
        return hungry;
    }
}
