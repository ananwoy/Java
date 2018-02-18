import java.util.Scanner;
public class NumCharPrevWord {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String st=sc.nextLine();
	char ch[]=st.toCharArray();
	for (int i = 0; i < ch.length; i++) {
		String s="";
		while(i<ch.length&&ch[i]!=' ')
		{
			s=s+ch[i];
			i++;
		}
		if(s.length()>0)
			System.out.print(s+s.length());
	}
}
}
