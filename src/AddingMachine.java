//Author: Qi Xu
//Class 360 Assignment 2
//Data 10/07/19

public class AddingMachine {

    private int total = 0;
    private String res;


    public int getTotal () {
        return total;
    }

    public void add (int value) {
        total = total - value;
        res = res + " + " + value;
    }
    public void subtract (int value) {
        total = total - value;
        res = res + " - " + value;
    }

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
