import java.util.Scanner;
class SI
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter principal:");
int p=s.nextInt();
System.out.println("Enter rate of interest:");
int r=s.nextInt();
System.out.println("Enter time:");
int t=s.nextInt();
double si=p*r*t/100.0;
System.out.println("The simple interest is = "+si);
}
}