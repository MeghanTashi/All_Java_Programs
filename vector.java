import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(5);
        v.add(15);
        v.add(25);
        v.add(35);
        v.add(45);

        System.out.println("Original Elements: " + v);
        v.insertElementAt(10, 2);
        v.remove(1);
        v.remove(4);
        System.out.println("Final Elements: " + v);
    }
}
