package inheritance;

public class Lion extends Animal {

    private String moveType = "merge";

    Lion(String name){
        super(name);
    }

    Lion(String name, int power){
        super(name, power);
    }

    @Override
    public String getMoveType() {
        return moveType;
    }

    public void move(){
        super.move();
        this.power -= 2;
    }

}
