//wap a program to define a method to delete an element from specified index
public class DeleteElementArray {
	static int[] delArr(int a[],int n)
	{
		if(n<0||n>=a.length)
		{
		System.out.println("not possible to delete");
		return a;
	}
		int na[]=new int[a.length-1];
		for (int i = 0; i < a.length-1; i++) {
			if(i<n)
			{
				na[i]=a[i];
			}else
				{
					na[i]=a[i+1];
			}
		}
		return na;
	}
	public static void main(String[] args) {
		int ar[]= {13,23,47,64,83,37,98,42};
		int b[]=delArr(ar, 2);
		System.out.println("New array : ");
		for (int i = 0; i < b.length; i++) {
		System.out.print(b[i]+" ");	
		}	
	}
	}


