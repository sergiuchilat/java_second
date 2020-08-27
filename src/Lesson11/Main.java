package Lesson11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("========Object 1=======");
        var staticObject1 = new TestStatic();
        staticObject1.increment();
        System.out.print("X = " + staticObject1.getX());
        System.out.println(", staticX = " + TestStatic.getStaticX());

        System.out.println("=========Object 2=======");
        var staticObject2 = new TestStatic();
        staticObject2.increment();
        System.out.print("X = " + staticObject2.getX());
        System.out.println(", staticX = " + TestStatic.getStaticX());

        System.out.println("=========Object 3=======");
        TestStatic staticObject3 = new TestStatic();
        staticObject3.increment();
        System.out.print("X = " + staticObject3.getX());
        System.out.println(", staticX = " + TestStatic.getStaticX());

        int month = 1;

        int days = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9 -> 30;
            case 2 -> {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter year: ");
                int year = scanner.nextInt();

                if (year % 4 == 0)
                    yield 29;
                else
                    yield 28;
            }
            default -> 0;
        };
        System.out.println(days + " days in month " + month);

        System.out.println("---------String----------");
        TestString.run();
    }
}
