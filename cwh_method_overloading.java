public class cwh_method_overloading {
    static void tellJoke() {
        System.out.println("LOL,this is a joke");
    }

    static int sum(int a, int b) {
        int c = a + b;
        System.out.println(c);
        return c;
    }

    public static void main(String[] args) {
        tellJoke();
        int x = 10;
        int y = 10;
        sum(x, y);
    }

}
