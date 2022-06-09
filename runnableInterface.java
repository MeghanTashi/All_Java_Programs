// Creating a class that implement Runnable Interface & run() method
class demo implements Runnable {
    public void run() {
        System.out.println("HELLO, THIS IS RUN METHOD!!");
    }
}

public class runnableInterface {
    public static void main(String[] args) {
        demo d = new demo();
        Thread t1 = new Thread(d);
        t1.start();
    }
}
