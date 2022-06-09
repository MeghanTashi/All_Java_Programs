import java.applet.*;

public class constructor extends Applet {
    int x, y, sum;

    constructor(int a, int b) {
        a = x;
        b = y;
    }

    void add() {
        sum = x + y;
        System.out.println("The sum is: " + sum);
    }

    public static void main(String[] args) {

        constructor cons = new constructor(10, 20);
        cons.add();
    }

}