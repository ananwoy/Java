import java.util.Scanner;
public class HexadecimalToDecimal {
static int power(int m,int n)
{
	int pw=1;
	for(int i=1;i<=n;i++)
	{
		pw=pw*m;
	}
	return pw;
}
static int hexToDec(String st)
{
	int sum=0;
	int p=0;
	for(int i=st.length()-1;i>=0;i--)
	{
		char ch=st.charAt(i);
		if(ch>=65&&ch<=90)
			sum= sum+(ch-55)*power(16,p);
		else if(ch>=97&&ch<=122)
			sum=sum+(ch-87)*power(16,p);
		else
			sum=sum+(ch-48)*power(16,p);
		p++;
	}
	return sum;
}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter hexadecimal number");
	String ab=s.next();
	int x=hexToDec(ab);
	System.out.println("decimal equivalent of "+ab+" is = "+x);
	s.close();
}
	

}
