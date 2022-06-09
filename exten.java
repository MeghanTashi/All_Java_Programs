class A {
    static int a = 10;
}

class B extends A {
    static int b = 20;
}

public class exten extends B {
    public static void main(String[] args) {
        System.out.println("The value of a + b is : " + (a + b));
        exten ex = new exten();
        ex.ok();
    }

    public void ok() {
        int x = 1;
        System.out.println(x);
    }
}