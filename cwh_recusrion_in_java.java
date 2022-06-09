// Function in Java can call itself. Such calling of a function by itself
// is called recursion.
public class cwh_recusrion_in_java {
    static int factorial(int a) {
        if (a == 0 || a == 1) {
            return 1;
        } else {
            return a * factorial(a - 1);
        }
    }

    static int factorial_iterative(int a) {
        if (a == 0 || a == 1) {
            return 1;
        } else {
            int result = 1;
            for (int i = 1; i <= a; i++) {
                result *= i;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("This factorial of 5 is: " + factorial(n));
        System.out.println("This factorial of 5 is: " + factorial_iterative(n));
    }

}