package design_patterns.singleton;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DB db = new DB(1);

        if(db.connect()){
            System.out.println(Arrays.toString(db.executeQuery("SELECT name FROM students")));
        } else {
            System.out.println("Connection error");
        }

        DB db2 = new DB(2);
        if(db2.connect()){
            System.out.println(Arrays.toString(db2.executeQuery("SELECT name FROM students")));
        } else {
            System.out.println("Connection error");
        }

//        DB db = DB.getInstance(1);
//
//        if(db.connect()){
//            System.out.println(Arrays.toString(db.executeQuery("SELECT name FROM students")));
//        } else {
//            System.out.println("Connection error");
//        }
//
//        DB db2 = DB.getInstance(2);
//        if(db2.connect()){
//            System.out.println(Arrays.toString(db2.executeQuery("SELECT name FROM students")));
//        } else {
//            System.out.println("Connection error");
//        }

        System.out.println(db.getInstanceNumber());
        System.out.println(db2.getInstanceNumber());
    }
}
