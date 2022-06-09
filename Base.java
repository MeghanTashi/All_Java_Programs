class overriding {
    protected void display() {
        System.out.println("Parent Class!");
    }
}

public class Base extends overriding {
    public void display() {
        System.out.println("Base Class!");
    }

    public static void main(String[] args) {
        Base b = new Base();
        b.display();
    }
}