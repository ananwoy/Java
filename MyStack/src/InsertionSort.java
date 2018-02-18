
public class InsertionSort {
static void selectionSort(int a[])
{
	for (int i = 1; i < a.length; i++) {
		int min=i;
		for (int j = i-1; j >= 0; j--) {
			if(a[j]>a[i])
				min=j;
		}
		int t=a[i];
		a[i]=a[min];
		a[min]=t;
	}
}
public static void main(String[] args) {
	int ar[]= {23,45,12,16,17,11};
	selectionSort(ar);
	for (int i = 0; i < ar.length; i++) {
		System.out.println(ar[i]);
	}
}
}
