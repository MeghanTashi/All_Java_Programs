interface newShape {
    void draw();
}

interface Circle extends newShape {
    void getRadius();

    int radius = 10;
}

class NewCircle implements Circle {
    public void getRadius() {
        System.out.println(radius);
    }

    public void draw() {
        System.out.println("Error Solved");
    }
}

class ExtendInterface extends NewCircle {
    public static void main(String args[]) {
        Circle nc = new NewCircle();
        nc.getRadius();
        nc.draw();
    }
}