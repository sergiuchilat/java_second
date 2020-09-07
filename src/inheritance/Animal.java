package inheritance;

public class Animal {
    protected String name;
    protected int power = 0;
    private String moveType = "se misca";

    Animal(String name){
        this.name = name;
    }
    Animal(String name, int power){
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public String getMoveType() {
        return moveType;
    }

    public void move(){
        if(this.power > 0)
            System.out.println(this.name  + " " + this.getMoveType());
        else
            System.out.println("ERROR: Power 0");
        this.power--;
    }
}
