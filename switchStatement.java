// Write any program using switch case statement

import java.util.*;

public class switchStatement {
    public static void write() {
        System.out.println("Write the Article!!");
    }

    public static void draw() {
        System.out.println("Drawing!!!");
    }

    public static void play() {
        System.out.println("Playing the toys!!");
    }

    public static void erase() {
        System.out.println("Erasing your work!!");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ch;
        while (true) {
            System.out.println("What you want to do??");
            System.out.println("1.Write");
            System.out.println("2.Draw");
            System.out.println("3.Play");
            System.out.println("4.Erase");
            System.out.println("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    write();
                    break;
                case 2:
                    draw();
                    break;
                case 3:
                    play();
                    break;
                case 4:
                    erase();
                    break;
            }
        }
    }
}