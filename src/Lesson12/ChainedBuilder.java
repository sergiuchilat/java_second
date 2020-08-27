package Lesson12;

public class ChainedBuilder {
    public ChainedBuilder build(String buildWhat){
        System.out.println(buildWhat);
        return this;
    }
}
