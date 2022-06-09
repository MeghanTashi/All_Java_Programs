public class cwh_array_practice_set {
    public static void main(String[] args) {

        // Problem 1
        /*
         * float[] marks = { 97.5f, 45.7f, 89.9f, 56.0f, 100 };
         * float sum = 0;
         * for (float f : marks) {
         * sum = sum + f;
         * }
         * System.out.println("The value of sum is " + sum);
         */

        // Problem 2;

        float[] marks = { 97.5f, 45.7f, 89.9f, 56.0f, 100 };
        float num = 56.0f;
        boolean isInArray = false;
        for (float f : marks) {
            if (num == f) {
                isInArray = true;
                break;
            }
        }
        if (isInArray) {
            System.out.println("The value is present in the array!");
        } else {
            System.out.println("the value is not present in the array!");
        }
    }
}
