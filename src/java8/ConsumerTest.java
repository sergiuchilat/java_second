package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerTest {

    public static Supplier<List<Integer>> numberGenerator = () -> Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    public static Consumer<Integer> displayN2 = (x) -> System.out.println(x * x );
    public static Consumer<List<Integer>> multiply2 = (list) -> multiply(2, list);
    public static Consumer<List<Integer>> multiply3 = (list) -> multiply(3, list);
    public static Consumer<List<Integer>> multiply4 = (list) -> multiply(4, list);
    public static Consumer<List<Integer>> displayList = (list) -> list.forEach(System.out::println);
    public static Consumer<List<Integer>> reverseList = Collections::reverse;

    public static void multiply(Integer multiplier, List<Integer> list){
        for (int i = 0; i < list.size(); i++){
            list.set(i, list.get(i) * 3);
        }
    }

    public static void main(String[] args) {

        numberGenerator.get().forEach(displayN2);

        multiply2
                .andThen(multiply3)
                .andThen(displayList)
                .andThen(reverseList)
                .andThen(multiply4)
                .andThen(displayList)
                .accept(numberGenerator.get());
    }

}
