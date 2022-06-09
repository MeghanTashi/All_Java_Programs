public class paramConst {
    int first, sec;

    paramConst(int a, int b) {
         first = a;
          sec = b;
    }

    void dis() {
        System.out.println("Addition is: " + first * sec);
    }

    public static void main(String[] args) {
        paramConst pc = new paramConst(10, 220);
        pc.dis();
    }
}
