package visibility;

public class Parent{
    public Integer x = 1;

    public void test(){
        System.out.println(this.getClass().getCanonicalName());
        System.out.println(this.toString());
        System.out.println(this.x);
    }
}
