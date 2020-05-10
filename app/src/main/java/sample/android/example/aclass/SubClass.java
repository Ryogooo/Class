package sample.android.example.aclass;

public class SubClass {

    //数の情報
    protected int number ;

    public SubClass(){
        this.number = 0;
    }


    public void numberUP(){
        this.number += 1;
    }

    public void numberDOWN(){
        this.number -= 1;
    }

    int getNumber(){
        return this.number;
    }
}
