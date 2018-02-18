import java.util.Scanner;
class RectArea
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter length of rectangle :");
int l=s.nextInt();
System.out.println("Enter breadth of rectangle :");
int b=s.nextInt();
int area=l*b;
System.out.println("Area of the rectangle is = "+area);
}
}