package Lesson9;

import Lesson9.nested.NestedChild;

public class TestProtected {
    public static void main() {
        Rabbit rabbit = new Rabbit("Rabbit");
        rabbit.testProtected();

        NestedChild nestedChild = new NestedChild();
        nestedChild.publicMethod();
    }
}
