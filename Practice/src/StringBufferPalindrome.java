

import java.util.Scanner;

public class StringBufferPalindrome {
static void isPalindrome(String st)
{
	StringBuffer s=new StringBuffer(st);
	if(st.equals(s.reverse().toString()))
	{
		System.out.println(st+" is a palindrome");
	}
	else
		System.out.println(st+" is not a palindrome");
}
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the string: ");
	String st=scn.next();
	isPalindrome(st);
}
}
