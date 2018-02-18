public class PalindromeArray {
static int palindrome(int a[])
{
	int count=0;
	for (int i = 0; i < a.length; i++) {
		int sum=0;
		int t=a[i];
		while(t!=0)
		{
			int b=t%10;
			sum=sum*10+b;
			t=t/10;
		}
		if (sum==a[i])
			count++;
	}
return count;
}
public static void main(String[] args) {
	int a[]= {121,131,456,898,345};
	int x=palindrome(a);
	System.out.println(x);
}
}
