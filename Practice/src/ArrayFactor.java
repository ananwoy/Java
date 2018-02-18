
public class ArrayFactor {
static void factor(int ar[])
{
int count[]=new int[ar.length];	
for (int i = 0; i < ar.length; i++) {
	for (int j = 1; j <=ar[i]/2; j++) {
		if(ar[i]%j==0)
			count[i]++;
	}
}
for (int i = 0; i < count.length; i++) {
	for (int j = i+1; j < count.length; j++) {
	if(count[i]<count[j])
	{
		int p=ar[i];
		ar[i]=ar[j];
		ar[j]=p;
		p=count[i];
		count[i]=count[j];
		count[j]=p;
	}
}
}
	for (int j = 0; j < count.length; j++) {
		System.out.print(ar[j]+" ");
	}

}
public static void main(String[] args) {
	int ch[]= {8,2,3,12,16};
	factor(ch);
}
}