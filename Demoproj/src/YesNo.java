import java.util.Scanner;

public class YesNo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String conf = null;

		do

		{
			System.out.println("Enter your name");
			String name = s.next();
			System.out.println("Hello " + name);
			System.out.println("will you enter more names");

			conf = s.next();

		} while (!conf.equals("yes"));

	}

}
