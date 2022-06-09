//Write a program to create two threads, one to print numbers in original order and other in
//reverse order from 1 to 50.
class Original extends Thread {

    public void run() {

        for (int i = 1; i <= 50; i++) {
            System.out.println("Original Order Thread : " + i);
        }
    }
}

class Reverse extends Thread {

    public void run() {

        for (int i = 50; i > 0; i--) {
            System.out.println("Reverse Order Thread : " + i);
        }
    }
}

public class numberPrinting {

    public static void main(String[] args) {

        new Original().start();
        new Reverse().start();
    }
}