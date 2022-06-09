import java.util.Scanner;

class UException extends Exception {
    Scanner in = new Scanner(System.in);
    String str;

    UException() {
    }

    UException(String message) {
        super(message);
    }

    void get() {
        System.out.println("Enter the country name: ");
        str = in.next();
    }

    void check() {
        try {
            System.out.println("try block");
            if (str.equals("India") == true) {
                System.out.println("Country name Matched");
            } else {
                throw new UException("NotMatchException");
            }
        } catch (Exception e) {
            System.out.println("catch block");
            e.printStackTrace();
        }
    }

    public static void main(String[] s) {
        UException ue = new UException();
        ue.get();
        ue.check();
    }
}
