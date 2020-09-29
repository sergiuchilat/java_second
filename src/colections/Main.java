package colections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List <Integer>numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        //numbers.remove(1);
        //numbers.set(0, 4);
        System.out.println(numbers.toString());
        System.out.println(numbers.get(0));
        numbers.add(0, 6);
        System.out.println(numbers.get(0));
        System.out.println(numbers.toString());

        Iterator <Integer> integerIterator = numbers.iterator();
        System.out.println(integerIterator.next());
        System.out.println(integerIterator.next());

        LinkedList <Integer> numbersLinked = new LinkedList<>();
        for (int i = 1; i <= 10; i++){
            numbersLinked.add(i);
        }
        System.out.println(numbersLinked.toString());

        ListIterator<Integer> integerIteratorLinked = numbersLinked.listIterator();

        while (integerIteratorLinked.hasNext()){
            System.out.println(integerIteratorLinked.next());
        }

        Set<Integer> digits= new HashSet<>();

        digits.add(2);
        digits.add(-8);
        digits.add(1);
        digits.add(-200);
        digits.add(100);
        digits.add(0);
        digits.add(null);


        System.out.println(digits);

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(200);
        treeSet.add(-80);
        treeSet.add(13);
        treeSet.add(13);
        treeSet.add(13);
        treeSet.add(0);
        treeSet.add(-2);
        treeSet.remove(100);
        System.out.println(treeSet);

        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(3);
        queue.add(3);
        queue.add(-3);
        queue.add(2);
        queue.add(-8);
        queue.add(4);
        queue.add(-6);
        System.out.println(queue);
        System.out.println(queue.peek());
    }
}
