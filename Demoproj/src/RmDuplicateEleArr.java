
public class RmDuplicateEleArr {
static int[] uniElement(int ar[])
{
	int n=ar.length;
	for (int i = 0; i < n; i++) {
		for (int j = i+1; j < n; j++) {
			if(ar[i]==ar[j])
			{
				ar[j]=ar[n-1];
				n--;
				j--;
			}
		}
	}
	int na[]=new int[n];
	for (int i = 0; i < n; i++) {
		na[i]=ar[i];
	}
	return na;
}
public static void main(String[] args) {
	int ar[]= {2,3,7,4,3,7,8,2};
	int b[]=uniElement(ar);
	for (int i = 0; i < b.length; i++) {
	System.out.println(b[i]);	
	}
	
}		
}
