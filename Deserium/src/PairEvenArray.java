public class PairEvenArray {
static void check(int x[])
{
	for (int i = 0; i < x.length; i++) {
		for (int j = i+1; j < x.length; j++) {
			if((x[i]+x[j])%2==0)
			{
				System.out.println(x[i]+"    "+x[j]);
			}
		}
	}
}
public static void main(String[] args) {
	int a[]= {92,53,44,85,96,77,58,99};
	System.out.println("pairs whose sum is even: ");
	check(a);
}
}
