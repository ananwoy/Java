import java.util.Scanner;
public class Panagram {
static boolean check(String st)
{
	char ch[]=st.toCharArray();
	System.out.print("Step 1: ");
	char ch1[]=remSpace(ch);
	System.out.print("Step 2: ");
	char ch2[]=toUpper(ch1);
	System.out.print("Step 3: ");
	char ch3[]=remDupEle(ch2);
	System.out.print("Step 4: ");
	sort(ch3);
	int count=0;
	for (int i = 0; i < ch3.length; i++) {
		if (ch3[i]==(char)(65+i))
				count++;
	}
	return count==26;
}
static char[] toUpper(char[] ch1) {
	for (int i = 0; i < ch1.length; i++) {
		if(ch1[i]>=97&&ch1[i]<=122)
			ch1[i]=(char)(ch1[i]-32);
		System.out.print(ch1[i]);
	}System.out.println();
	return ch1;
}
static char[] remSpace(char c[])
{
	String s="";
	for (int i = 0; i < c.length; i++) {
		if(c[i]!=' ')
			s=s+c[i];
	}
	System.out.print(s);
	System.out.println();
	return s.toCharArray();
}
static char[] remDupEle(char c[])
{
	int n=c.length;
for (int i = 0; i < n; i++) {
	for (int j = i+1; j < n; j++) {
		if(c[i]==c[j])
		{
			c[j]=c[n-1];
			n--;
			j--;
		}	
	}
}
char cr[]=new char[n];
for (int i = 0; i < cr.length; i++) {
	cr[i]=c[i];
	System.out.print(cr[i]);
}System.out.println();
return cr;
}
static void sort(char[] c) {
	for (int i = 0; i < c.length; i++) {
		for (int j = 0; j < c.length; j++) {
			if (c[i] < c[j]) {
				char t = c[i];
				c[i] = c[j];
				c[j] = t;
			}	
		}
	}
	for (int i = 0; i < c.length; i++) {
		System.out.print(c[i]);
	}
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter sentence: ");
	String s=sc.nextLine();
	boolean x=check(s);
	if(x)
		System.out.println("\n\nString is Panagram");
	else
		System.out.println("\n\nString is NOT Panagram");
}
}