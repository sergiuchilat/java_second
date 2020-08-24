package Lesson9;

import Lesson9.nested.NestedChild;

public class TestProtectedExtended extends NestedChild {
    public void run() {
        NestedChild nestedChild = new NestedChild();
        nestedChild.publicMethod();
    }

    public void testRun() {
        this.protectedMethod();
    }
}
