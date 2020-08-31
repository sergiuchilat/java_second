package interfaces;

import interfaces.models.Canvas;
import interfaces.models.figures.Point;
import interfaces.models.figures.Segment;

public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.draw(new Point("Point 1", 4, 12));
        canvas.draw(new Segment("Segment 1", new Point("Point 1", 0, 0), new Point("Point 1", 1, 1)));
        canvas.draw(new String("Some string"));
    }
}
