import java.util.Scanner;
public class SwapFrstLst2 {
static String swap(String st)
{
	char ch[]=st.toCharArray();
for (int i = 0; i < ch.length; i++) {
	if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
	{
		int f=i;
		while(i<ch.length&&ch[i]!=' ')
		{
			i++;
		}
		char t=ch[f];
		ch[f]=ch[i-1];
		ch[i-1]=t;
	}
}	
return new String(ch);
}
public static void main(String[] args) {
String a="Ram and laxman are Brothers";
String b=swap(a);
System.out.println(b);
}
}
