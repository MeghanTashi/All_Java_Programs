class Demo4 {
    static void fun() throws ArrayIndexOutOfBoundsException {
        try {
            int arr[] = { 1, 2, 3, 4, 5 };
            System.out.println(arr[6]);
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("catch block");
            System.out.println("You are trying to access an element which is beyond array's size");
        } finally {
            System.out.println("finally block");
        }
    }

    public static void main(String[] s) {
        fun();
        try {

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
