class Main2 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + ".Name: " + Thread.currentThread().getName());
            System.out.println(i + ".Priority: " + Thread.currentThread().getPriority());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.toString());
            }
        }
    }

    public static void main(String[] s) {
        Main2 tt1 = new Main2();
        Main2 tt2 = new Main2();
        Main2 tt3 = new Main2();

        tt1.setPriority(1);
        tt2.setPriority(5);
        tt3.setPriority(10);

        tt1.start();
        tt2.start();
        tt3.start();
    }
}
