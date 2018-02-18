
public class SearchElementRecursion {
static int search(int ar[],int ele,int in)
{
	if(in>=ar.length)
		return -1;
	if(ar[in]==ele)
		return in;
	return search(ar,ele,in+1);
}
public static void main(String[] args) {
	int ar[]= {2,5,7,9,4,5,0,9,7,1};
	int x=search(ar,9,0);
	System.out.println(x);
}
}
