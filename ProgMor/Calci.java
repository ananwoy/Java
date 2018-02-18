import java.util.Scanner;
class Calci
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter two numbers : ");
double x=s.nextDouble();
double y=s.nextDouble();
double sum=x+y;
double subtract=x-y;
double multiply=x*y;
double divide=x/y;
System.out.println("Addition of two numbers is = "+sum);
System.out.println("Subtraction of two numbers is = "+subtract);
System.out.println("Multiplication of two numbers is = "+multiply);
System.out.println("Division of two numbers is = "+divide);
}
}