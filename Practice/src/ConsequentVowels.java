import java.util.Scanner;

public class ConsequentVowels {
static void remove(String st)
{
	char ch[]=st.toCharArray();
	for (int i = 0; i < ch.length; i++) {
		String s="";
		while(i<ch.length&&(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'))
		{
			s=s+ch[i];
			i++;
		}
		if(s.length()>1)
		System.out.println(s);
	}
}
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	String st=scn.nextLine();
	remove(st);
}
}
