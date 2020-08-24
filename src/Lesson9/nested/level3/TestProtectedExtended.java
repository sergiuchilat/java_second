package Lesson9.nested.level3;

import Lesson9.nested.NestedChild;

public class TestProtectedExtended extends NestedChild {
    public static void main(String[] args) {
        NestedChild nestedChild = new NestedChild();
        nestedChild.publicMethod();
    }

    public void testRun() {
        this.protectedMethod();
    }
}
