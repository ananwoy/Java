public class SpiralMatrix {
static void spiral(int a[][])
{
	int n=a.length;
	for(int i=0,j=n-1;i<j;i++,j--)
	{
		for (int k = i; k < j; k++) {
			System.out.print(a[i][k]+" ");
		}
		for (int k = i; k < j; k++) {
			System.out.print(a[k][j]+" ");
		}
		for (int k = j; k > i; k--) {
			System.out.print(a[j][k]+" ");
		}
		for (int k = j; k > i; k--) {
			System.out.print(a[k][i]+" ");
		}
	}
	if(n%2==1)
	{
		System.out.print(a[n/2][n/2]);
	}
}
public static void main(String[] args) {
	int a[][]= {{5,6,7,8,9},{2,3,4,5,2},{7,8,9,3,4},{6,2,5,8,5},{3,9,2,1,7}};
	spiral(a);
}
}
