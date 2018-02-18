package department;

import java.util.Scanner;

public class MainRunner {
	public static void main(String[] args) {
		Department dp = getDepartment();
		String sub[] = dp.getSubjects();
		System.out.println("Batch Name: " + dp.getName());
		System.out.println("Subjects: ");
		for (int i = 0; i < sub.length; i++) {
			System.out.println(sub[i]);
		}
	}

	private static Department getDepartment() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter branch: ");
		String dept = s.next();
		Department dp = null;
		if (dept.equalsIgnoreCase("Mechanical")) {
			dp = new Mechanical("MECH2014");
		} else if (dept.equalsIgnoreCase("CS")) {
			dp = new CS("CS2014");
		} else if (dept.equalsIgnoreCase("Electronics")) {
			dp = new Electronics("ECE2014");
		} else if (dept.equalsIgnoreCase("Chemical")) {
			dp = new Chemical("CHEM2014");
		} else if (dept.equalsIgnoreCase("Electrical")) {
			dp = new Electrical("EE2014");
		}
		return dp;
	}
}
