import java.util.Scanner;
public class CountCapitalSmallVowelConsonantsDigitsSpclChar {
static void count(String st)
{
	int vc=0,uc=0,cc=0,dc=0,sc=0,lc=0;
	for (int i = 0; i < st.length(); i++) {
		char ch=st.charAt(i);
		if(ch>='A'&&ch<='Z')
		{
			uc++;
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				vc++;
			else
				cc++;
		}
	else if(ch>='a'&&ch<='z')
	{
		lc++;
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			vc++;
		else
			cc++;
	}
	else if(ch>='0'&&ch<='9')
		dc++;
	else
		sc++;
	}
	System.out.println("No. of lower case = "+lc);
	System.out.println("No. of upper case = "+uc);
	System.out.println("No. of vowels = "+vc);
	System.out.println("No. of consonants = "+cc);
	System.out.println("No. of digits = "+dc);
	System.out.println("No. of special characters = "+sc);
}
public static void main(String[] args) {
	System.out.println("Enter word");
	Scanner s=new Scanner(System.in);
	String a=s.next();
	count(a);
}
}