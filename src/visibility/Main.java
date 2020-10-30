package visibility;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();

        parent.test();

        Child child = new Child();
        //child.setX(2);
        child.test();
    }
}
