import java.util.*;

public class userInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, sum;
        System.out.println("Enter 1st Value: ");
        a = sc.nextInt();
        System.out.println("Enter 2nd Value: ");
        b = sc.nextInt();
        sum = a + b;
        System.out.println("The addition of both Numbers is: " + sum);
        sc.close();
    }
}
