public class ReverseRowEleMatrix {
static void reverse(int a[][])
{
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length/2; j++) {
			int t=a[i][j];
			a[i][j]=a[i][a.length-1-j];
			a[i][a.length-1-j]=t;
		}
		
	}
	System.out.println("Reversed array is: ");
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
System.out.print(a[i][j]+" ");			
		}System.out.println();
	}
}
public static void main(String[] args) {
	int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
	reverse(a);
}
}