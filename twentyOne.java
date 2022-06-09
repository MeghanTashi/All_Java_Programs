class Age {
    int age[] = { 13, 56, 23, 78, 45, 34, 24, 23, 25, 27, 22, 21 };
}

class Thread1 implements Runnable {
    Age a;

    public void run() {
        for (int i = 0; i <= 11; i++) {
            if (a.age[i] % 2 == 0)
                System.out.println("Even age=" + a.age[i]);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }

    }

    Thread1(Age a) {
        this.a = a;
    }
}

class Thread2 implements Runnable {
    Age b;

    public void run() {
        for (int i = 0; i <= 11; i++) {
            if (b.age[i] % 2 != 0)
                System.out.println("Odd age=" + b.age[i]);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
    }

    Thread2(Age b) {
        this.b = b;
    }
}

class twentyOne {
    public static void main(String[] s) {
        Age a = new Age();

        Thread1 t1 = new Thread1(a);
        Thread2 t2 = new Thread2(a);

        Thread t11 = new Thread(t1);
        Thread t22 = new Thread(t2);

        t11.start();
        t22.start();
    }
}
