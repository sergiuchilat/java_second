package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Logger;

public class MyException {
    private final Logger logger = Logger.getLogger(MyException.class.getName());
    public static void main(String[] args) {
        try{
            new MyException().readFile();
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        }
        new MyException().readFile2();
    }

    public void readFile() throws FileNotFoundException {
        FileReader fileReader = new FileReader("test") ;
    }

    public void readFile2(){
        try{
            FileReader fileReader = new FileReader("test") ;
        } catch (FileNotFoundException e) {
            logger.warning("warning");
            logger.severe("severe" + e.toString());
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }
}
