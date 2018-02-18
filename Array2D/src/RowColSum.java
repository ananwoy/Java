public class RowColSum {
static void sum(int a[][])
{
	
	for (int i = 0; i < a.length; i++) {
		int sumr=0,sumc=0;
		for (int j = 0; j < a[i].length; j++) {
			sumr=sumr+a[i][j];
			sumc=sumc+a[j][i];
		}
		System.out.println(i+1+" row sum "+sumr);
		System.out.println(i+1+" column sum "+sumc);
	}
}
public static void main(String[] args) {
	int a[][]= {{3,5,7},{8,9,2},{1,6,4}};
	sum(a);
}}
