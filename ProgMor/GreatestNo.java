import java.util.Scanner;
class GreatestNo
{
public static void main(String args[])
{
System.out.println("Enter 3 numbers:");
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
if (a>b && a>c)
{
System.out.println(a+" is greatest");
}
else if (b>c)
{
System.out.println(b+" is greatest");
}
else
{
System.out.println(c+" is greatest");
}
}
}