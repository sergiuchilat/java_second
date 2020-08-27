package di;

import di.model.Math;
import di.model.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        float x;
        float y;
        try{
            System.out.print("x = ");
            x = in.nextFloat();
            System.out.print("y = ");
            y = in.nextFloat();
        } catch (Exception e){
            System.out.println(e.toString());
            return;
        }

        Calculator calculator = new Calculator();
        Math math = new Math();

        System.out.println(calculator.toString());

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
