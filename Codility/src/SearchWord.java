import java.util.Scanner;
public class SearchWord {
static void search(String st,String sr)
{
	char c1[]=st.toCharArray();
	int count=0;
	for (int i = 0; i < c1.length; i++) {
		String s="";
		while(i<c1.length&&c1[i]!=' ')
		{
			s=s+c1[i];
			i++;
		}
		if(s.length()>0&&s.equalsIgnoreCase(sr))
		{
			System.out.println("String exists");
			count++;
			break;
			}
		}
	if(count==0)
	System.out.println("String doesnot exist");
	}
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter sentence: ");
	String st= scn.nextLine();
	System.out.println("Enter word: ");
	String sr=scn.next();
	search(st,sr);
}
}
