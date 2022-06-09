// Simple calculator using scanner class in Java
import java.util.Scanner;

class swit {
    public static void main(final String[] args) {
        double a, b;
        double c;
        int ch;
        char op;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Enter a value: ");
            a = in.nextDouble();
            System.out.println("Enter b value: ");
            b = in.nextDouble();
            System.out.println("1. Addition ");
            System.out.println("2. Subtraction ");
            System.out.println("3. Multiplication ");
            System.out.println("4. Division");
            System.out.println("Enter the choice");
            ch = in.nextInt();

            switch (ch) {
                case 1:
                    c = a + b;
                    System.out.println("Addition: " + c);
                    break;
                case 2:
                    c = a - b;
                    System.out.println("Subtraction: " + c);
                    break;
                case 3:
                    c = a * b;
                    System.out.println("Multiplication: " + c);
                    break;
                case 4:
                    c = a / b;
                    System.out.println("Division: " + c);
                    break;
                default:
                    System.out.println("Invaild Choice");
            }
            System.out.println("Do u wanna continue?? ");
            op = in.next().charAt(0);
        } while (op == 'Y' || op == 'y');
        in.close();
    }
}
