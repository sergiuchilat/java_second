package Lesson9;

public class Rabbit extends Animal{

    public Rabbit(String name){
        super(name);
        this.eatWhat = "flower";
    }

    void setAge(int age){
        this.age = age;
    }
}
