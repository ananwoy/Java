
public class Codility {
static void find(int ar[])
{
	int big=ar[0];
	for (int j = 0; j < ar.length; j++) {
		if(big<ar[j])
			big=ar[j];
	}
	for (int i = 1; i < big; i++) {
		int count=0;
		for (int j = 0; j < ar.length; j++) {
			if(i==ar[j])
			{
				count++;
			}
		}
		if(count==0)
		{
		System.out.println(i);
		break;
		}
	}
}
public static void main(String[] args) {
	int a[]= {10,-1,-3,-5,1,4,0,2,3,5,6,7,3,2,1,9,8,0,5,11,14,13,16,17,18,19,23,12,21,25,17,16,27,29,33,15
			};
	System.out.println("Smallest +ve number which doesnt exist in array is");
	find(a);
}
}
