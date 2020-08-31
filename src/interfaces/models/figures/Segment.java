package interfaces.models.figures;

public class Segment extends Figure implements IFigure, ISegment{
    private final Point start;
    private final Point end;
    public Segment(String name, Point start, Point end){
        super(name);
        this.start = start;
        this.end = end;
    }

    @Override
    public void draw() {
        System.out.println("SEGMENT");
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }
}
