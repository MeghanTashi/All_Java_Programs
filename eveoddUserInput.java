// Program to check whether the number is even or odd using Scanner class.

import java.util.*;

public class eveoddUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter number Value: ");
        num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
        sc.close();
    }

}
