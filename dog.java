class animal {
    void move() {
        System.out.println("You have moved the animal!");
    }
}

public class dog extends animal {
    @Override
    void move() {
        System.out.println("You have moved the dog!");
    }

    public static void main(String[] args) {
        dog d = new dog();
        d.move();
    }
}
