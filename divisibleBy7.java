public class divisibleBy7 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 100; i < 200; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
                count++;
                sum = sum + i;
            }
        }
        System.out.println("Number of values divisble by 7 is: " + count);
        System.out.println("Sum of the values divisible by 7 is: " + sum);
    }
}
