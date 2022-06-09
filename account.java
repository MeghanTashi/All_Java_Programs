/*Write a Java program to create a class account having variable accno, accname and balance.
Define deposit () and withdraw () methods. Create one object of class and perform the operation.
*/

public class account {
    int balance = 1000, accno = 1648;
    String accname = "Bank of Baroda";

    void withdraw() {
        System.out.println("\n\n");
        System.out.println("Account Name: " + accname);
        System.out.println("Account No: " + accno);
        balance = balance - 100;
        System.out.println("Balance: " + balance);
    }

    void deposit() {
        System.out.println("\n\n");
        System.out.println("Account Name: " + accname);
        System.out.println("Account No: " + accno);
        balance = balance + 100;
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        account ac = new account();
        ac.deposit();
        ac.withdraw();
    }
}