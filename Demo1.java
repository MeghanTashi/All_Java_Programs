import java.util.*;

class Demo1 {
    public static void main(String[] args) {
        try {
            System.out.println("try block");
            System.out.println("main starts");
            Scanner in = new Scanner(System.in);
            System.out.println("Enter a value: ");
            int a = in.nextInt();
            System.out.println("Enter b value: ");
            int b = in.nextInt();
            int c = a / b; // new ArithmeticException("/by zero");
            System.out.println(c);
            in.close();
        } catch (ArithmeticException e) {
            System.out.println("catch block");
            System.out.println("Zero Divide");
        } finally {
            System.out.println("finally block");
            System.out.println("main method ends");
        }
    }
}
