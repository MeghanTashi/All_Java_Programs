// Write a program to check number is even or odd.

import java.util.*;

public class evenOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Number is Even Number");
        } else {
            System.out.println("Number is Odd Number");
        }
        sc.close();
    }
}
