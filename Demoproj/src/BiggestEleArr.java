import java.util.Scanner;
public class BiggestEleArr {
static int maxArr(int a[])
{
	int max=a[0];
	for (int i = 0; i < a.length; i++) {
	if(max<a[i])
	{
		max=a[i];
	}
		}
	return max;
}
public static void main(String[] args) {
	int a[]= {72,2,3,4,5,69,7,9,34};
	int z=maxArr(a);
	System.out.println("max value is "+z);
}}