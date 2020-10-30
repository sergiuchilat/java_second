package design_patterns.singleton;

public class DB {

    private static DB instance = null;
    private Integer instanceNumber = null;

    public DB(Integer number){
        this.instanceNumber = number;
    }

    public static DB getInstance(Integer number){
        if(DB.instance == null){
            DB.instance = new DB(number);
        }

        return DB.instance;
    }

    public boolean connect(){
        return true;
    }

    public String[] executeQuery(String query){
        return new String[] {
                "Ion Creanga",
                "Mihai Eminescu"
        };
    }

    public Integer getInstanceNumber() {
        return instanceNumber;
    }
}
