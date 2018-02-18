import java.util.Scanner;
public class PatternBarfi {
static void make(int n)
{
	int sp=n/2;
	int st=0;
	for (int i = 0; i < n+1; i++) {
		for (int j = sp; j > 0; j--) {
			System.out.print(" ");
		}
		int c=1;
		for (int j = 0; j <= st; j++) {
			System.out.print(c);
			if(j<st/2)
				c++;
			else
				c--;
		}
		System.out.println();
		if(i<n/2)
		{
			sp--;
			st+=2;
		}
		else
		{
			sp++;
			st-=2;
		}
	}
}
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int x=scn.nextInt();
	make(x);
}
}
