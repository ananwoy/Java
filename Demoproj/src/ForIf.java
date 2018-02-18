
import java.util.Scanner;

public class ForIf {
	public static void main(String[] args) {

		Scanner s1 = new Scanner(System.in);
		int x = s1.nextInt();
		s1.close();
		if (x % 2 == 0)
			System.out.println(x + "-->BUZZ");
		else
			System.out.println(x + "-->FIZZ");
	}
}
