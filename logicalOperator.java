// Write a program to make use of logical Operators.

import java.util.Scanner;

public class logicalOperator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        if(num % 2 == 0 && num > 30){
            System.out.println("Number is positive and Number is Greater than 30");
        }
    }
}
