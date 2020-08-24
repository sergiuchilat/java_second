package di;

import di.model.Math;
import di.model.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("x = ");
        float x = in.nextFloat();
        System.out.print("y = ");
        float y = in.nextFloat();

        Calculator calculator = new Calculator();
        Math math = new Math();

        System.out.println(">>> START calculation");

        try {
            calculator.powerOn();
            calculator.display(math.add(x, y));
            calculator.display(math.substract(x, y));
            calculator.display(math.add(math.substract(x, y) - math.add(1, 4), 8));
            calculator.display(math.divide(x, y));
            calculator.powerOff();
        } catch (Exception e){
            System.out.println(e.toString());
        } finally {
            System.out.println(">>> END calculation");
        }
    }
}
