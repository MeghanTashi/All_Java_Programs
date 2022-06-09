// Program using logical operators
public class logic {
    public static void main(String[] args) {
        int a = 5, b = 5, c = 2;
        if ((a == b) && (a > c)) {
            System.out.println(a + " is equal to " + b + " and " + a + " and " + b + " is greater than " + c);
            System.out.println("And Condition is satisfied");
        } else {
            System.out.println("AND condition is not satisfied");
        }
        if ((a > b) || (b == c)) {
            System.out.println(a + "is greater than " + b + "as well as" + b + "is equal to " + c);
            System.out.println("OR condition is satisfied");
        } else {
            System.out.println("OR condition is not satisfied");
        }
        if (a != 0) {
            System.out.println("Not condition is not satisied");
        } else {
            System.out.println(a + " i.e a is zero");
            System.out.println("Not condition is not satisfied");
        }

    }
}