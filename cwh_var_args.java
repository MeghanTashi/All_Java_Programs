// Var Args take an arguments in form of array
// So it helps developer to pass as many as arguments to the method without multiplying the number of methods

public class cwh_var_args {
    static int sum(int... arr) {
        int result = 0;
        for (int a : arr) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("The value of 2 + 3 is: " + sum(2, 3));
        System.out.println("The value of 2 + 3 + 5 is: " + sum(2, 3, 5));
        System.out.println("The value of 2 + 3 + 5 + 12 is: " + sum(2, 3, 5, 12));
        System.out.println("The value of 2 + 3 + 5 + 12 + 20 is: " + sum(2, 3, 4, 12, 20));
    }
}
