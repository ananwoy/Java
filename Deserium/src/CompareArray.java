public class CompareArray {
static boolean compare(int a[], int b[])
{
	if(a.length!=b.length)
		return false;
	int n=b.length;
	for (int i = 0; i < a.length; i++) {
		{
			for (int j = 0; j < n; j++) {
				if (a[i]==b[j])
				{
					b[j]=b[n-1];
					n--;
					break;
				}
			}
		}
	}
return n==0;
}
public static void main(String[] args) {
int a[]= {2,3,5,4,6};
int b[]= {2,3,6,4,5};
boolean z=compare(a,b);
if(z)
	System.out.println("Same");
else
	System.out.println("not same");

}
}
