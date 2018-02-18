import java.util.Scanner;

public class PerfectNumber {
static void check(int n)
{
	for (int i = 1; i <= n; i++) {
		int sum=0;
		for (int j = 1; j <= i/2; j++) {
		if(i%j==0)
			sum=sum+j;
	}
		if(i==sum)
			System.out.println(i);
	}
}
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter range: ");
	int x=scn.nextInt();
	check(x);
}
}
