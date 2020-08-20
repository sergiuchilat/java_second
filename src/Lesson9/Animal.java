package Lesson9;

abstract public class Animal {
    private final String name;
    protected String eatWhat = "everything";
    protected boolean alive = true;

    public Animal(String name){
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public String eat(){
        return eatWhat;
    }

    public void die(){
        this.alive = false;
    }

    public boolean isAlive() {
        return this.alive;
    }
}
