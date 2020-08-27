package Lesson11;

public class TestString {
    public static void run(){
        String s1 = "word1";
        String s2 = "word2";
        String s3 = "word1";
        String s4 = "word4";
        String s5 = new String("word1");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        System.out.println(s5.hashCode());
    }
}
