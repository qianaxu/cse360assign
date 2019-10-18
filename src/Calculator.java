//Author: Qi Xu
//Class 360 Assignment 3
//Data 10/17/19

public class Calculator extends AddingMachine {

    protected int total;
    protected String res = " ";

    public Calculator () { // not needed - included for clarity

        total = 0;
    }

    //use getTotal to review previous value.
    public int getTotal () {

        return total;
    }
   //add value to total
    public void add (int value) {
        total += value;
        res += " + " + value;
    }
    //deduct value from total
    public void subtract (int value) {
        total -= value;
        res += " - " + value;
    }

  //multiply value with total
    public void multiply (int value) {
        if(value <= 0){
            total = 0;
            res = " * " + total;
        } else {
            total *= value;
            res += " * " + value;
        }
    }
     //divide value from total
    public void divide (int value) {
        if(value != 0) {
            total /= value;
            res = res.concat(" / " + value);
        } else {
            total = 0;
            res = res.concat(" / " + value);
        }
    }
    //print out all previous action in string
    public String getRes () {

        return res;
    }

    public void clear(){
        this.total = 0;
        this.res = " ";
    }
}
