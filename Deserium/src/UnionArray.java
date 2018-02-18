public class UnionArray {
static int[] union(int a[],int b[])
{
int k=b.length;
for (int i = 0; i < a.length; i++) {
	for (int j = 0; j < k; j++) {
		if(a[i]==b[j])
		{
			b[j]=b[--k];
		}
	}
}
int na[]=new int[a.length+k];
for (int i = 0; i < na.length; i++) {
	if(i<a.length)
		na[i]=a[i];
	else
		na[i]=b[--k];
}
return na;
}
public static void main(String[] args) {
	int a[]= {23,45,56};
	int b[]= {12,13,45,23,57,23};
	int c[]=union(a,b);
	for (int i = 0; i < c.length; i++) {
		System.out.println(c[i]);
	}
}}
