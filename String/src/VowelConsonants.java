import java.util.Scanner;
public class VowelConsonants {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		char ch[]=st.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			String s="";
			int vw=0;
			int cc=0;
			while(i<ch.length&&ch[i]!=' ')
			{
				s=s+ch[i];
				if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
					vw++;
				else
					cc++;
				i++;
			}
			if(s.length()>0)
				{
				System.out.println(s+" --> vowel --> "+vw);
				System.out.println(s+" --> consonant --> "+cc);
				}
		}
		
	}
	}


