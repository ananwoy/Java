import java.util.Scanner;
public class Bits {
static int counter(int n)
{
	int b, count=0; 
	while(n!=0)
	{
		b=n%2;
		if(b==1)
			count++;
		n=n/2;
	}
	return count;
}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter decimal number:");
	int x=s.nextInt();
	int a=counter(x);
	System.out.println("bits of "+x+" is "+a+" bits");	
}
}
