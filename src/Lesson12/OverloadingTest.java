package Lesson12;

final class Point {
    public int x;
    public int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x) {
        this();
        this.x = x;
    }

    public Point(int x, int y) {
        this(x);
        this.y = y;
    }
}

public class OverloadingTest {
    public int add(int a, int b) {
        return a + b;
    }

    public String add(char a, char b) {
        return a + "" + b;
    }

    public <T> String add(T a, T b) {
        return "Unknown type [" + a.getClass() + " ]for 'a'" + ",\n Unknown type [" + b.getClass() + "] for 'b'";
    }

    public String drawFigure() {
        return "Unknown figure";
    }

    public String drawFigure(Point point) {
        return "Point:[" + point.x + ", " + point.y + "]";
    }

    public String drawFigure(Point pointStart, Point pointEnd) {
        return "Segment: [" + pointStart.x + ", " + pointStart.y + "], [" + pointEnd.x + ", " + pointEnd.y + "]";
    }

    public String drawFigure(Point pointA, Point pointB, Point pointC) {
        return "Triangle: [" + pointA.x + ", " + pointA.y + "], [" + pointB.x + ", " + pointB.y + "], [" + pointC.x + ", " + pointC.y + "]";
    }
}
