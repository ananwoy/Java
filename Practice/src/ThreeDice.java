
public class ThreeDice {
static int count(int n)
{
	int d1[]= {1,2,3,4,5,6};
	int count=0;
	for (int i = 0; i < d1.length; i++) {
		for (int j = 0; j < d1.length; j++) {
			for (int k = 0; k < d1.length; k++) {
				if(d1[i]+d1[j]+d1[k]==n)
					count ++;
			}
		}
	}
	return count;
}
public static void main(String[] args) {
	int x=5;
	int z=count(x);
	System.out.println(z);
}
}
