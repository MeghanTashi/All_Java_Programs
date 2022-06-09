/**
 * age
 */
public class age {

    public static void main(String[] args) {
        int age = 13;
        if (age <= 12) {
            System.out.println("You are kid");
        } else if (age >= 13 && age < 18) {
            System.out.println("You are Teenager");
        } else {
            System.out.println("You are Adult");
        }
    }
}