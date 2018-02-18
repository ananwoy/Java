public class Rotate90left {
public static void main(String[] args) {
	int a[][]= {{3,5,7},{8,9,2},{1,6,4}};
	TransposeMatrix t =new TransposeMatrix();
			t.swap(a);
			ReverseRowEleMatrix r=new ReverseRowEleMatrix();
			r.reverse(a);
	System.out.println("90 left array is: ");
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			System.out.print(a[i][j]+" ");
		}System.out.println();
	}
}
}
