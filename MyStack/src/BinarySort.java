
public class BinarySort {
static int binarySearch(int ar[], int ele, int min, int high)
{
	int mid=(min+high)/2;
	
	if(ar[mid]==ele)
	{
		return mid;
	}
	if(ar[mid]<ele)
	{
		return binarySearch(ar,ele,mid+1,high);
	}
	else
		return binarySearch(ar,ele,min,mid-1);
}
static void bubbleSort(int a[])
{
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			if(a[i]>a[j])
			{
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
		}
	}
}
public static void main(String[] args) {
	int ar[]= {23,45,12,16,17,11};
	int ele=11;
	bubbleSort(ar);
	int in=binarySearch(ar, ele, 0, ar.length-1);
	if(in>=0)
		System.out.println(ele+" is in "+(in));
	else
		System.out.println("not present");
}
}
