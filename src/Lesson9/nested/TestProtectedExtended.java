package Lesson9.nested;

public class TestProtectedExtended extends NestedChild{
    public static void main(String[] args) {
        NestedChild nestedChild = new NestedChild();
        nestedChild.publicMethod();
        nestedChild.protectedMethod();
    }
}
