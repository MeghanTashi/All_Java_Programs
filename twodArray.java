import java.util.*;

/**
 * twodArray
 */
public class twodArray {

    int i, j;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Enter elements in array");
                arr[i][j] = sc.nextInt();
                System.out.println("The elements are: " + arr[i][j]);
            }
        }
        sc.close();

    }

}