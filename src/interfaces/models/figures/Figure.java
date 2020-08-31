package interfaces.models.figures;

abstract public class Figure {
    protected String name;
    Figure(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
