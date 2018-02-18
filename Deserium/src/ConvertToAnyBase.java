//define a method
import java.util.Scanner;
public class ConvertToAnyBase {

		static String convert(int n, int base) {
			String bin = "";
			int b;
			while (n != 0) {
				b = n % base;
				if (b < 10)
					bin = b + bin;
				else
					bin = (char) (55 + b) + bin;
				n = n / base;
			}
			return bin;
		}

		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter decimal number:");
			int b=s.nextInt();
			System.out.println("Enter base to which you want to convert:");
			int x = s.nextInt();
			String a = convert(b,x);
			System.out.println(x+" base equivalent of " + b + " is = " + a);
		}
	}


