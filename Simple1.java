class Ascending extends Thread {
    public void run() {
        for (int i = 1; i <= 15; i++) {
            System.out.println("Ascending Thread : " + i);
        }
    }
}

class Descending extends Thread {
    public void run() {
        for (int i = 15; i > 0; i--) {
            System.out.println("Descending Thread : " + i);
        }
    }
}

public class Simple1 extends Thread {

    public static void main(String[] args) {
        Ascending a = new Ascending();
        a.start();
        Descending d = new Descending();
        d.start();
    }
}