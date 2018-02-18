
public class SelectionSort {
static void selectionSort(int a[])
{
	for (int i = 0; i < a.length; i++) {
		int min=i;
		for (int j = i+1; j < a.length; j++) {
			if(a[min]>a[j])
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
