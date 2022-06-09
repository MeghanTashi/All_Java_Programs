
/**
 * Main
 */
import java.util.*;

public class Main {
    int x;

    Main(int a) {
        x = a;
    }

    void display() {
        System.out.println("The value of x is: " + x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main m = new Main(sc.nextInt());
        m.display();
        sc.close();
    }
}