public class LargeDiagonal {
static void result(int a[][])
{
	int max1=a[0][0], max2=a[0][a.length-1];
	for (int i = 0; i < a.length; i++) {
		if(max1<a[i][i])
			max1=a[i][i];
		if(max2<a[i][a.length-1-i])
			max2=a[i][a.length-1-i];
	}System.out.println("largest element of primary diagonal is: "+max1);
	System.out.println("largest element of secondary diagonal element is: "+max2);
	}
public static void main(String[] args) {
	int a[][]= {{1,5,7,8},{8,2,2,1},{1,6,9,5},{9,9,4,0}};
	result(a);
}
}