// Program in Java using If-Else 
public class fourth {
    public static void main(String[] args) {
        int Age_of_Aadil = 17;
        int Age_of_Hamza = 16;
        int Age_of_Anurag = 15;
        if (Age_of_Aadil > Age_of_Hamza) {
            if (Age_of_Aadil > Age_of_Anurag) {
                System.out.println("Aadil is oldest");
            }
        } else if (Age_of_Hamza > Age_of_Aadil) {
            if (Age_of_Hamza > Age_of_Anurag) {
                System.out.println("Hamza is oldest");
            }
        } else {
            System.out.println("Anurag is oldest");
        }
    }
}