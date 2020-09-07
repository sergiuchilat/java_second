package inheritance;

public class Fish extends Animal{
    Fish(String name){
        super(name);
    }


    public void move(){
        super.move();
        this.power -= 1;
    }
}
