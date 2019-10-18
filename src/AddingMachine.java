//Author: Qi Xu
//Class 360 Assignment 2
//Data 10/07/19


public class AddingMachine {

    protected int total = 0;
    protected String res = " ";

    public AddingMachine () {
        total = 0;  // not needed - included for clarity
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
    //print out all previous action in string
    public String getRes () {
        System.out.print("0");
        System.out.print(res);

        return "";
    }

    public void clear(){
        this.total = 0;
        this.res = " ";
    }

}
