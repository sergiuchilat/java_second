package enums;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public enum Colors {
        RED ("#FF0000", "Red"),
        GREEN ("#00FF00"),
        BLUE ("#0000FF"),
        BLACK;
        private String hexCode;
        private String name;

        Colors(){
            this.hexCode = "";
            this.name = "";
        }

        Colors(String hexCode) {
            this();
            this.hexCode = hexCode;
        }

        Colors(String hexCode, String name){
            this(hexCode);
            this.name = name;
        }

        public static String getHexCode(Colors color) {
            return color.hexCode;
        }

        public static String getName(Colors color) {
            return color.name;
        }
    }

    public enum Roles{
        ADMIN("Full access"),
        USER("Read only access");

        private final String description;

        Roles(String name) {
            this.description = name;
        }

        public static Roles detect(String name) {
            return Roles.valueOf(name);
        }

        public String getDescription(){
            return this.description;
        }
    }

    public enum Levels{
        LOW(1),
        MEDIUM(2),
        HIGH(3);
        private final Integer numericLevel;
        public static Map<Integer, Levels> MAP =  new HashMap<>();
        Levels(Integer numericLevel){
            this.numericLevel = numericLevel;
        }

        public Integer getNumericLevel(){
            MAP.put(numericLevel, this);
            return numericLevel;
        }
    }

    public static void testColors(){
        System.out.println(Colors.RED + ":" + Colors.getHexCode(Colors.RED) + ":" + Colors.getName(Colors.RED));
        System.out.println(Colors.GREEN + ":" + Colors.getHexCode(Colors.GREEN) + ":" + Colors.getName(Colors.GREEN));
        System.out.println(Colors.BLUE + ":" + Colors.getHexCode(Colors.BLUE) + ":" + Colors.getName(Colors.BLUE));

        for (Colors color: Colors.values()) {
            System.out.println(color + ":" + Colors.getHexCode(color) + ":" + Colors.getName(color));
        }

        Colors someColor = Colors.GREEN;

        if(someColor == Colors.GREEN) {
            System.out.println("There is a green color");
        } else {
            System.out.println("There is not a green color");
        }

        switch (someColor) {
            case RED -> System.out.println("All is red");
            case BLUE -> System.out.println("Some blue color");
            case GREEN -> System.out.println("Green planet");
            default -> System.out.println("Unknown color");
        }
    }

    public static void testRoles(){
        //String appRole = "ADMIN";
        String appRole = "USER";

        if(Roles.detect(appRole) == Roles.ADMIN) {
            System.out.println("Hello ADMIN");
            System.out.println(Roles.ADMIN.getDescription());
        } else {
            System.out.println("Hello user");
            System.out.println(Roles.USER.getDescription());
        }
    }

    public static void testLevels(){
        System.out.println(Levels.LOW);
        System.out.println(Levels.HIGH.getNumericLevel());
        System.out.println(Levels.MAP);
        System.out.println(Levels.MAP.get(2));
        if(Levels.MAP.get(2) != null){
            System.out.println("Level 2");
        }
    }

    public static void main(String[] args) {
        //Main.testColors();
        //Main.testRoles();
        Main.testLevels();
    }
}
