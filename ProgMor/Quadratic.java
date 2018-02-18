import java.util.Scanner;
class Quadratic
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("A quadratic equation is in the form ax^2+bx+c=0");
System.out.println("Enter a b and c");
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
int result=b*b-4*a*c;
if (result>0)
{
double root1=(-b+Math.pow(result, 0.5))/(2.0*a);
double root2=(-b-Math.pow(result, 0.5))/(2.0*a);
System.out.println("Root 1 is "+root1+" and Root 2 is "+root2);
}
else if(result==0)
{
double root=-b/(2.0*a);
System.out.println("Root is "+root);
}
else
{
System.out.println("Equation has no real roots");
}
}
}
