package java8;

import java.util.*;

public class FunctionalInterface {
    static FibonacciInterface fibonacci = (f1, f2, instance) -> {
        if(f2 > 1000000) {
            return instance;
        }
        instance.get(f2, f1 + f2, instance);
        System.out.println(f1);
        return instance;
    };

    public static void main(String[] args) {


        fibonacci.get(0, 1, fibonacci);

//        PrintInterface printInterface1 = (message) ->System.out.println("[" + message + "]");
//
//        PrintInterface printInterface2 = (message) ->System.out.println("(" + message + ")");
//
//        printInterface1.print("hello");
//        printInterface2.print("hello");


        List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        numbers.forEach(System.out::println);
    }
}
