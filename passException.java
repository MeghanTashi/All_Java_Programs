import java.util.Scanner;

class passException extends Exception {
    Scanner in = new Scanner(System.in);
    String pass = "hamza@123";
    String upass;

    passException() {
    }

    passException(String message) {
        super(message);
    }

    void getpass() {
        System.out.println("Enter the password: ");
        upass = in.next();
    }

    void checkpass() {
        try {
            System.out.println("try block");
            if (upass.equals(pass) == true) {
                System.out.println("Authentication Success");
            } else {
                throw new passException("Authentication Failure");
            }
        } catch (Exception e) {
            System.out.println("catch block");
            e.printStackTrace();
        }
    }

    public static void main(String[] s) {
        passException ipe = new passException();
        ipe.getpass();
        ipe.checkpass();
    }

}