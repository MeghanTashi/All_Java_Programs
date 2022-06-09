class pyramid {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                // Prints the num value
                System.out.print(j + " ");
            }
            // printing in new line
            System.out.println();
        }
    }
}