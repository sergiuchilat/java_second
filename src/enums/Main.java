package enums;

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

    public static void main(String[] args) {
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
}
