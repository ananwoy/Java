import java.util.Scanner;
class Average
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter first number");
double x=s.nextDouble();
System.out.println("Enter second number");
double y=s.nextDouble();
System.out.println("Enter third number");
double z=s.nextDouble();
double a = (x+y+z)/3;
System.out.println("Average of three numbers is = " + a);
}
}