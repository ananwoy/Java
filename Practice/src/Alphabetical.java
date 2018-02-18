import java.util.Scanner;
public class Alphabetical {
static String[] sort(String st, String st1)
{
	String al[]= {st,st1};
	char ch[]=st.toCharArray();
	char ch1[]=st1.toCharArray();
	int i=0;
	while(i<ch.length&&i<ch1.length&&ch[i]==ch1[i])
		{
			i++;
		}
		if(ch[i]>ch1[i])
		{
			String t=al[0];
			al[0]=al[1];
			al[1]=t;
		}
	return al;
}
public static void main(String[] args) {
	System.out.println("enter 2 strings:");
	Scanner scn=new Scanner(System.in);
	String st=scn.next();
	String st1=scn.next();
	String al[]=sort(st,st1);
	for (int i = 0; i < al.length; i++) {
		System.out.print(al[i]+" ");
	}
}
}
