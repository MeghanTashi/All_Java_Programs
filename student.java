import java.util.Scanner;

//Define a class student with int id and string name as data members and a method void SetData ( ). Accept and display the data for five students.
public class student {
    static Scanner sc = new Scanner(System.in);
    static int id;
    static String name;

    public void setData() {
        System.out.println("Enter your ID & NAME: ");
        id = sc.nextInt();
        name = sc.nextLine();
    }

    public void showData() {
        System.out.println("Your name is: " + name);
        System.out.println("Your ID is: " + id);
    }

    public static void main(String[] args) {
        student[] stu = new student[5];
        for (int i = 0; i < stu.length; i++) {
            stu[i] = new student();
        }
        for (int i = 0; i < stu.length; i++) {
            stu[i].setData();
            stu[i].showData();
        }
    }
}

