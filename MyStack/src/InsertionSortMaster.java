
public class InsertionSortMaster {
static void insertionSort(int ar[])
{
	for (int i = 0; i < ar.length; i++) {
		int t=ar[i];
		int j=i-1;
		for (; j>=0&&ar[j] >t; j--) {
			ar[j+1]=ar[j];
		}
		ar[j+1]=t;
	}
}
public static void main(String[] args) {
	int ar[]= {23,45,12,16,17,11};
	insertionSort(ar);
	for (int i = 0; i < ar.length; i++) {
		System.out.println(ar[i]);
	}
}
}

