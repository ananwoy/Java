import java.util.Scanner;
public class ConvertWordIniCap {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String st=sc.nextLine();
	char ch[]=st.toCharArray();
	for (int i = 0; i < ch.length; i++) {
		if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
		{
			if(ch[i]>=97&&ch[i]<=122)
			{
				ch[i]=(char)(ch[i]-32);
			}
		}
		else if(ch[i]>=65&&ch[i]<=90)
		{
			ch[i]=(char)(ch[i]+32);
		}
}
		String s=new String(ch);
		System.out.println(s);
}
}
