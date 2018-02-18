import java.util.Scanner;

public class SortSplitWordsAlpha {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s1 = scn.nextLine();
		String words[] = splitIntoWords(s1);
		sortBasedOnAlpha(words);
		for (int i = 0; i < words.length; i++) {
			System.out.println((i + 1) + " word is --> " + words[i]);
		}
	}

	private static void sortBasedOnAlpha(String[] words) {
		for (int i = 0; i < words.length; i++) {
			for (int j = i+1; j < words.length; j++) {
				int c=compareTo(words[i],words[j]);
				if (c>0)
				{
					String t=words[i];
					words[i]=words[j];
					words[j]=t;
				}
			}
		}
	}
	static int compareTo(String s1,String s2)
	{
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		int k=0;
		while(k<c1.length&&k<c2.length&&c1[k]==c2[k])
		{
			k++;
		}
		if(k==c1.length)
			return -1;
		else if(k==c2.length)
			return 1;
		if(c1[k]>c2[k])
			return 1;
		return -1;
	}

	private static String[] splitIntoWords(String s) {
		int wc = countWords(s);
		String w[] = new String[wc];
		char c[] = s.toCharArray();
		int index = 0;
		for (int i = 0; i < c.length; i++) {
			w[index] = "";
			while (i < c.length && c[i] != ' ') {
				w[index] += c[i];
				i++;
			}
			if (w[index].length() > 0)
				index++;
		}
		return w;
	}

	private static int countWords(String s) {
		int count = 0;
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (i == 0 && ch[i] != ' ' || ch[i] != ' ' && ch[i - 1] == ' ')
				count++;
		}
		return count;
	}
}
