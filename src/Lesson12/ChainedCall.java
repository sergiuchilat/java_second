package Lesson12;

public class ChainedCall {
    private int number;
    ChainedCall(int number){
        this.number = number;
    }

    ChainedCall div_2(){
        if(this.number % 2 == 0)
            System.out.println("divisible by 2");
        return this;
    }

    ChainedCall div_3(){
        if(this.number % 3 == 0)
            System.out.println("divisible by 3");
        return this;
    }

    ChainedCall div_10(){
        if(this.number % 10 == 0)
            System.out.println("divisible by 10");
        return this;
    }

    void end(){
        System.out.println("End");
    }
}
