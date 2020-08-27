package Lesson12;

public class Main {
    public static void main(String[] args) {
        OverloadingTest ot = new OverloadingTest();
        System.out.println(ot.add(1, 2));
        System.out.println(ot.add('x', 'y'));
        System.out.println(ot.add('x', "String"));
        System.out.println(ot.add(1.222F, "String"));

        System.out.println(ot.drawFigure());
        System.out.println(ot.drawFigure(new Point(2, 3)));
        System.out.println(ot.drawFigure(new Point(2), new Point(5, 8)));
        System.out.println(ot.drawFigure(new Point(2, 3), new Point(), new Point(0, 8)));


        ChainedCall number = new ChainedCall(60);

        number
            .div_2()
            .div_3()
            .div_10()
            .end();

        ChainedBuilder homeBuilder = new ChainedBuilder();

        homeBuilder.build("Foundation").build("walls").build("roof");
    }
}
