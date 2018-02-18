import java.util.Scanner;
public class Palindrome {
static boolean check(String st)
{
	String s="";
	char ch[]=st.toCharArray();
	for (int i = 0; i < ch.length; i++) {
		s=ch[i]+s;
	}
	return (s.equals(st));
}
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the string");
	String str=scn.next();
	boolean x=check(str);
	if(x)
		System.out.println("String is palindrome");
	else
		System.out.println("String is not palindrome");
}
}
