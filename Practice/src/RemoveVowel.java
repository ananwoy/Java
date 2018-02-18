import java.util.Scanner;
public class RemoveVowel {
static String remove(String st)
{
	char ch[]=st.toCharArray();
	String s="";
	for (int i = 0; i < ch.length; i++) {
		if(ch[i]!='a'&&ch[i]!='e'&ch[i]!='i'&&ch[i]!='o'&&ch[i]!='u'&&ch[i]!='A'&&ch[i]!='E'&&ch[i]!='I'&&ch[i]!='O'&&ch[i]!='U')
			s=s+ch[i];
	}
	return s;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter string: ");
	String st=sc.nextLine();
	String stt=remove(st);
	System.out.println(stt);
}
}
