public class circle {
    static float pi = 3.15f, radius;

    circle(float r) {
        radius = r;
    }

    public void area() {
        double area = pi * radius * radius;
        System.out.println("The area of the cirle is: " + area);
    }

    public static void main(String[] args) {
        circle c = new circle(10f);
        c.area();
    }
}
