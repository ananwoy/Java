import java.util.Scanner;
public class SumDigits {
static int sumOfDigits(String st)
{
	int sum=0;
	for (int i = 0; i < st.length(); i++) {
		char ch=st.charAt(i);
		if(ch>=48&&ch<=57)
		{
			sum=sum+(ch-48);
		}
	}
	return sum;
}
public static void main(String[] args) {
	System.out.println("Enter word");
	Scanner s=new Scanner(System.in);
	String a=s.next();
	int x=sumOfDigits(a);
	System.out.println("Sum of digits in "+a+" is = "+x);
}
}