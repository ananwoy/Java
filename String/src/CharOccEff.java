import java.util.Scanner;
public class CharOccEff {
static void count(String st)
{
	char ch[]=st.toCharArray();
	int c[]=new int[128];
	for (int i = 0; i < ch.length; i++) {
		c[ch[i]]++;
	}
	for (int i = 0; i < c.length; i++) {
		if(c[i]!=0)
		{
			System.out.println((char)i+" ----> "+c[i]);
		}
	}
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String: ");
	String st = sc.next();
	count(st);
}
}