// Write a program to make use of ternary operator/ conditional operator

public class ternaryOperator {
    public static void main(String[] args) {
        int a = 10, b = 20, result;
        // if a < b the a + b or a - b
        result = (a < b) ? (a + b) : (a - b);
        System.out.println("Result is: " + result);
    }
}
