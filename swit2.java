// Program to find out if the given chracter is vowel or not
import java.util.Scanner;

class swit2 {
    public static void main(String[] args) {
        char ch;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any character: ");
        ch = in.next().charAt(0);
        switch (ch) {
            case 'a':
                System.out.println(ch + " is a vowel");
                break;
            case 'e':
                System.out.println(ch + " is a vowel");
                break;
            case 'i':
                System.out.println(ch + " is a vowel");
                break;
            case 'o':
                System.out.println(ch + " is a vowel");
                break;
            case 'u':
                System.out.println(ch + " is a vowel");
                break;
            default:
                System.out.println("Invalid input");
        }
        in.close();
    }
}
