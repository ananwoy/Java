
public class PetrolCar {
static int checkPetrol(int n, int dist[], int cap[])
{
	for (int i = 0; i < dist.length; i++) {
		if(n<dist[i])
			return -1;
			else
			n=n+cap[i]-dist[i];		
	}
	return n;
}
public static void main(String[] args) {
	int dist[]= {1,5,3};
	int cap[]= {6,4,2};
	int n=2;
	int x=checkPetrol(n, dist, cap);
	if(x==-1)
		System.out.println("no petrol");
	else
		System.out.println("petrol left is "+x+" litres");
}
}
