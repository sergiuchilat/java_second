package di;

import di.model.Math;
import di.model.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Math math = new Math();

        System.out.println(">>> START calculation");
        calculator.powerOn();
        try {
            calculator.display(math.add(2, 3));
            calculator.display(math.substract(4, 2));
            calculator.display(math.add(math.substract(4, 2) - math.add(1, 4), 8));
            calculator.display(math.divide(3, 0));
            calculator.powerOff();
        } catch (Exception e){
            System.out.println(e.toString());
        } finally {
            System.out.println(">>> END calculation");
        }
    }
}
