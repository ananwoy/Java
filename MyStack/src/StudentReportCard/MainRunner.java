package StudentReportCard;

import java.util.Scanner;

public class MainRunner {
	public static void main(String[] args) {
		ReportCards rep = new ReportCards();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1. addStudents \n2. display \n3. Generate Report Card\n4. Get Best Topper Info");
			System.out.println(" enter choice: ");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				if (rep.add(StudentReport.readStudent()))
					System.out.println("added succesfully");
				else
					System.out.println("fails to add");
				break;
			case 2:
				rep.display();
				break;
			case 3: System.out.println("enter roll number:");
				int rollno=sc.nextInt();
				rep.getReport(rollno);
				break;
			case 4: rep.getBest();	
				
			default:
				return;
			}
		}
	}
}
