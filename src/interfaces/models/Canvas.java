package interfaces.models;

import interfaces.models.figures.Point;
import interfaces.models.figures.Segment;

public class Canvas {
    public void draw(Point figure) {
        figure.draw();
        System.out.print("Name: " + figure.getName());
        System.out.println(" , Coordinates: [" + figure.getX() + ", " + figure.getY() + "]");
    }

    public void draw(Segment figure) {
        figure.draw();
        System.out.print(figure.getName());
        System.out.println(" , Coordinates: start=[" + figure.getStart().getX() + ", " + figure.getStart().getY() + "], end=[" + figure.getEnd().getX() + ", " + figure.getEnd().getY() + "]");
    }

    public <T> void draw(T figure) {
        System.out.println("Unknown figure");
    }
}
