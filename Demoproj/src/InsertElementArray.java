//program to insert element in an array in a specified index
public class InsertElementArray {
static int[] insertArr(int a[],int n,int ele)
{
	if(n<0||n>a.length)
	{
	System.out.println("not possible to insert");
	return a;
}
	int na[]=new int[a.length+1];
	for (int i = 0; i < a.length; i++) {
		if(i<n)
		{
			na[i]=a[i];
		}else
			{
				na[i+1]=a[i];
		}
		na[n]=ele;
	}
	return na;
}
public static void main(String[] args) {
	int ar[]= {13,23,47,64,83,37,98,42};
	int b[]=insertArr(ar, 2,976);
	System.out.println("New array : ");
	for (int i = 0; i < b.length; i++) {
	System.out.print(b[i]+" ");	
	}	
}
}
