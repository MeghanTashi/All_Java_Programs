abstract class ab {
    void print() {
    };

}

class abss extends ab {
    void print() {
        System.out.println("Hello World");
    };
}

public class abs extends ab {
    void print() {
        System.out.println("Hello 2");
    };

    public static void main(String[] args) {
        abss a = new abss();
        abs ab = new abs();
        a.print();
        ab.print();
    }
}