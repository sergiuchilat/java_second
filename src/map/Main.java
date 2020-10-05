package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        //Map<Integer, Map<Integer, String>> map = new HashMap<>();
//        Map<Integer, String> map = new HashMap<>();
//        map.put(1, "String");
//        System.out.println(map);
//
//        Map<Integer, Map<Integer, String>> map2 = new HashMap<>();
//        map2.put(1, map);
//
//        System.out.println(map2);

        Map<String, String> field = new HashMap<>();
        Map<String, Map<String, String>> person = new HashMap<>();

        field.put("address", "Moldova");
        field.put("age", "30");
        field.put("phone", "+37345664565");
        person.put("Ion Creanga", field);

        field.put("address", "Romania");
        field.put("age", "32");
        field.put("phone", "+404656645656");
        person.put("Mihai Eminescu", field);

        System.out.println(person);
        System.out.println(person.get("Ion Creanga").get("phone"));
        System.out.println(person.keySet());

        Map<Integer, String> list = new HashMap<>();
        list.put(1, "Test");

        for (Map.Entry<Integer, String> item: list.entrySet()){
            System.out.println(item.getKey());
            System.out.println(item.getValue());
        }

        list.forEach((key, value) -> {
            System.out.println(key);
            System.out.println(value);
        });


    }
}
