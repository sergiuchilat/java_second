package interfaces.models.figures;

public class Point extends Figure implements IFigure, IPoint{
    private final int x;
    private final int y;
    public Point(String name, int x, int y){
        super(name);
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("POINT");
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
