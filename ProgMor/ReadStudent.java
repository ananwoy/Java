	import java.util.Scanner;
	class ReadStudent 
	{
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter student id: ");
			int id=sc.nextInt();
			System.out.println("Enter student name: ");
			String name=sc.next();
			System.out.println("Enter student percentage: ");
			double per=sc.nextDouble();
			System.out.println("******Student Information*******");
			System.out.println("ID: "+id);
			System.out.println("Name: "+name);
			System.out.println("Percentage: "+per);
		}
	}
