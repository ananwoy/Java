import java.util.Scanner;
public class ExpandAllString {
static void expand(String st)
{
	char ch[]=st.toCharArray();
	for (int i = 0; i < ch.length; i++) {
		if(ch[i]!='-')
		{
			System.out.print(ch[i]);
		}
		else 
		{
			int n=ch[i-1];
			int m=ch[i+1];
			if(m>n)
			{
			for (int j = n+1; j < m; j++) {
				System.out.print((char)(j));
			}
			}
			else
			{
			for (int j = n-1; j > m; j--) {
			System.out.print((char)(j));
			}
			}
		}
	}
}
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter string: ");
	String st=scn.nextLine();
	expand(st);
}
}
