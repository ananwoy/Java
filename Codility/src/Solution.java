
public class Solution {
static int solution(int ar[])
{
int big=0;
for (int i = 0; i < ar.length; i++) {
	if(big<ar[i])
		big=ar[i];
	}
int c[]=new int[big+1];
for (int i = 0; i < ar.length; i++) {
	if(ar[i]>0)
		c[ar[i]]++;
}
for (int i = 1; i < c.length; i++) {
	if(c[i]==0)
		return i;
}
return big+1;
}
public static void main(String[] args) {
int a[]= {-1,-3,-5,4,0,2};
int x=solution(a);
System.out.println(x);
}
}