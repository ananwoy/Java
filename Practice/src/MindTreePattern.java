import java.util.*;

public class MindTreePattern {
	public static void main(String[] args) {
		int c = 1;
		for (int i = 1; i <= 5; i++) {
			if (i % 2 != 0) {
				for (int j = 1; j <= 2 * i - 1; j++) {
					if (j % 2 == 0)
						System.out.print("*");
					else {
						System.out.print(c);
						c++;
					}
				}
				System.out.println();
			} else {
				int k = c + i - 1;
				for (int j = 1; j <= 2 * i - 1; j++) {
					if (j % 2 == 0)
						System.out.print("*");
					else {
						System.out.print(k);
						k--;
						c++;
					}
				}
				System.out.println();
			}
		}
	}
}
