import java.util.Scanner;

public class SwitchExample2 {
	static void even() {
		System.out.println("Even");
	}

	static void odd() {
		System.out.println("odd");
	}

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter integer");
		int n = s.nextInt();
		switch (n % 2) {
		case 0:
			even();
			break;
		case 1:
			odd();
		}
	}
}
