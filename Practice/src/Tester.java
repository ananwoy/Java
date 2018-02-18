import java.util.Scanner;
public class Tester {
	static void reverse(String st)
	{
		String s="";
		char ch[]=st.toCharArray();
		for (int i = 0 ;i<ch.length;i++) {
			int k=i;
			while(i<ch.length&&ch[i]!=' ')
			{
				i++;
			}
			int j=i-1;
			while(k<=j)
			{
				s=s+ch[j];
				j--;
			}
			if(i<ch.length)
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