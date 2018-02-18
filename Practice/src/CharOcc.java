import java.util.Scanner;
public class CharOcc {
static void count(String st)
{
	char ch[]=st.toCharArray();
	for (int i = 0; i < ch.length; i++) {
		int count=1;
		for (int j = i+1; j < ch.length; j++) {
			if(ch[i]==ch[j])
			{
				count++;
				ch[j]=' ';
			}
		}
		if(ch[i]!=' ')
		{
			System.out.print(ch[i]+""+count);
		}
		}
}
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	String st=	scn.nextLine();
	count(st);
}
}
