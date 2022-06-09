/* Write a Java program for defining class Item having data member code and price. Accept data for
one object and display it.*/

import java.util.Scanner;

public class Item {
    Scanner sc = new Scanner(System.in);
    int a, price = 10;
    String s, code = "Meghan";

    void Accept() {
        System.out.print("Enter a String: ");
        s = sc.nextLine();
        System.out.print("Enter Number: ");
        a = sc.nextInt();
    }

    void display() {
        System.out.println("Your String is " + s);
        System.out.println("Your Number is " + a);
    }

    public static void main(String[] args) {
        Item myObj = new Item();
        myObj.Accept();
        myObj.display();
    }
}
