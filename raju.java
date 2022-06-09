import java.util.*;

interface i1 {
	public void input();

	public void output();
}

public class raju implements i1 {
	int a, b;
	Scanner sc = new Scanner(System.in);

	public void input() {
		System.out.println("Enter a number: ");
		a = sc.nextInt();
		System.out.println("Enter a number: ");
		b = sc.nextInt();
	}

	public void output() {
		System.out.println("The result is: " + (a + b));
	}

	public static void main(String[] args) {
		raju r1 = new raju();
		r1.input();
		r1.output();
	}
}