// Write a program to demonstarte the use of multiple if statements.

import java.util.*;

public class multipleIFstatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Enter your Age!!!");
        age = sc.nextInt();

        if (age == 10) {
            System.out.println("Your age is 10!");
        }

        if (age == 20) {
            System.out.println("Your age is 20!");
        }

        if (age == 30) {
            System.out.println("Your age is 30!");
        }
        sc.close();
    }
}