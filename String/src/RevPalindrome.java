import java.util.Scanner;
public class RevPalindrome {
static boolean isPalindrome(String st)
{
	for(int i=0;i<st.length()/2;i++)
	{
		if(st.charAt(i)!=st.charAt(st.length()-1-i))
			return false;
	}
	return true;
}
public static void main(String[] args) {
	System.out.println("Enter word");
	Scanner s=new Scanner(System.in);
	String a=s.next();
	boolean x=isPalindrome(a);
	if(x)
	{
		System.out.println(a+" is palindrome");
	}
	else
		System.out.println(a+ " isnt a palindrome");
}
}
