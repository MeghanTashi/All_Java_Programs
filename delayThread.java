class ok extends Thread {

    public void run() {

        for (int i = 1; i <= 50; i++) {
            System.out.println("Original Order Thread : " + i);
        }
    }
}

class ok1 extends Thread {

    public void run() {
        for (int i = 50; i > 0; i--) {
            System.out.println("Reverse Order Thread : " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

    }

}

public class delayThread {
    public static void main(String[] args) {
        ok k = new ok();
        ok1 k1 = new ok1();
        k.start();
        k1.start();

    }
}
