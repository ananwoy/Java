import java.util.Scanner;
public class WordReverse {
	static void reverse(String st)
	{
		String s="";
		char ch[]=st.toCharArray();
		for (int i = ch.length-1 ;i>=0;i--) {
			int k=i;
			while(i>=0&&ch[i]!=' ')
			{
				i--;
			}
			int j=i+1;
			while(k>=j)
			{
				s=s+ch[j];
				j++;
			}
			if(i>=0)
				s=s+ch[i];
		}
		System.out.println(s);
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter sentence");
		String st=s.nextLine();
		reverse(st);
	}
}