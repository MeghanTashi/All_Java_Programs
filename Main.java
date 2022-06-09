class LOL implements Runnable {
    @Override
    public void run() {
        System.out.println("THIS IS RUNNABLE INTERFACE CLASS");
    }
}
public class Main extends Thread {
    @Override
    public void run() {
        System.out.println("HELLO THE THREAD IS RUNNING!!");
        System.out.println("THIS IS RUN METHOD!!");
    }

    public static void main(String[] args) {
        Main m = new Main();
        LOL l = new LOL();
        Thread t = new Thread(l);
        t.start();
        m.start();
    }
}