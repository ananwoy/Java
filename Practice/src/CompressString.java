
public class CompressString {
static void compress(String st)
{
	char ch[]=st.toCharArray();
	String s="";
	for (int i = 0; i < ch.length; i++) {
		int k=1;
		int j = i+1;
			while(j<ch.length&&ch[i]==ch[j])
			{
				k++;
				j++;
				i++;
			}
		s=s+ch[i]+k;
	}
	System.out.println(s);
}
public static void main(String[] args) {
	String st="aabbcccc";
	compress(st);
}
}
