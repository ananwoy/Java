
public class SubArr0 {
static void find(int ar[])
{
	int c=0;
	for (int i = 0; i < ar.length; i++) {
		int sum=0;
		int k=i;
		while(k<ar.length&&(k==i||sum!=0))
		{
			sum=sum+ar[k];
			k++;
		}
		if(sum==0)
		{
			for (int j = i; j < k; j++) {
				System.out.print(ar[j]);
				if(j<k-1)
					System.out.print(",");
			}
			System.out.println("\n");
			c++;
		}
		
	}
	if(c==0)
		System.out.println("Doesnot exist");
}
public static void main(String[] args) {
	int a[]= {5,-6,7,1,-6,4,3,-2,8};
	System.out.println("sub arrays whose sum is zero: ");
	find(a);
}
}
