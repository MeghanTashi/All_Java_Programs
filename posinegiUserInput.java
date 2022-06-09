// Program to check whether the given number is positive or negative.

import java.util.Scanner;

public class posinegiUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        if (num > 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }
        sc.close();
    }

}
