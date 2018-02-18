public class RevDiagonal {
static void reverse(int a[][])
{
	for (int i = 0; i < a.length/2; i++) {
		int t=a[i][i];
		a[i][i]=a[a.length-i-1][a.length-i-1];
		a[a.length-i-1][a.length-i-1]=t;
		int p=a[i][a.length-1-i];
		a[i][a.length-1-i]=a[a.length-1-i][i];
		a[a.length-1-i][i]=p;
	}
	for (int i= 0;i  < a.length;i ++) {
		for (int j = 0; j < a[i].length; j++) {
			System.out.print(a[i][j]+" ");
		}System.out.println();
	}
	}
public static void main(String[] args) {
	int a[][]= {{3,5,7,8},{8,9,2,1},{1,6,4,5},{3,7,4,0}};
	reverse(a);
}
}
