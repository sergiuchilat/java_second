package di.model;

public class Calculator {
    private boolean on = false;
    public void display(Float result) throws Exception{
        if(!on){
            throw new Exception("Calculator is OFF");
        }
        System.out.println(result);
    }

    public void powerOn(){
        this.on = true;
        System.out.println("Power ON");
    }

    public void powerOff(){
        this.on = false;
        System.out.println("Power OFF");
    }
}
