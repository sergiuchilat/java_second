package Lesson11;

public class TestStatic {
    public static int staticX = 0;
    public int X = 0;


    public void increment(){
        X++;
        staticX++;
    }

    public static int getStaticX() {
        return staticX;
    }

    public int getX() {
        return X;
    }
}
