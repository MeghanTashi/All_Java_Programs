public class parameterizedConstructor {
    int x, y;

    parameterizedConstructor(int a, int b) {
        x = a;
        y = b;
    }

    void add() {
        System.out.println("The addition is: " + (x + y));
    }

    public static void main(String[] args) {
        parameterizedConstructor pc = new parameterizedConstructor(29, 11);
        pc.add();
    }
}
