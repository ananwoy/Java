import java.util.Scanner;
public class DecimalToBinary {
static String convert(int n)
{
	String bin=""; int b;
	while(n!=0)
	{
		b=n%2;
		bin=b+bin;
		n=n/2;
	}
	return bin;
}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter decimal number:");
	int x=s.nextInt();
	String a=convert(x);
	System.out.println("binary equivalent of "+x+" is "+a);	
}
}
