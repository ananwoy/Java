import java.util.Scanner;
class CircleArea
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
final double pi=22/7.0;
System.out.println("Enter radius of circle :");
double r=s.nextDouble();
double area=pi*r*r;
System.out.println("Area of circle is = "+area);
}
}