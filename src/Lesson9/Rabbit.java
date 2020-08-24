package Lesson9;

public class Rabbit extends Animal{

    public Rabbit(String name){
        super(name);
        this.eatWhat = "flower";
    }

    public void setAge(int age){
        this.age = age;
    }

    protected void testProtected(){
        System.out.println("test protected");
    }
}
