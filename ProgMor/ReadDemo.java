import java.util.Scanner;
class ReadDemo
{
public static void main(String args[])
{
System.out.println("main method start");
Scanner scn=new Scanner(System.in);
System.out.println("enter the age");
int x = scn.nextInt();
System.out.println("Entered age is: " + x);
System.out.println("main method end");
}

}