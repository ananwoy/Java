
public class PtternMind {
public static void main(String[] args) {
	int n=4;
	int c=1;
	for (int i = 0; i <n; i++) {
		for (int j = 0; j < 2*i ; j++) {
			System.out.print("_");
		}
		for (int j = 0; j < 2*n-2*i; j++) {
			if(j%2!=0)
			{
			System.out.print(c);
			c++;
			}
			else
				System.out.print("*");
		}
		int t=c-1+(n-i)*(n-i)-(n-i)+1;
		for (int j = 0; j < 2*n-2*i; j++) {
			if(j%2!=0)
			{
			System.out.print(t);
			t++;
			}
			else
				System.out.print("*");
			
		}
		System.out.println();
	}
}
}
