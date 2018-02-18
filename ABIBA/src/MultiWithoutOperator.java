import java.util.Scanner;
public class MultiWithoutOperator {
static int multiply(int x, int y)
{
	int sum=0;
	int count=0;
	while(sum!=x){
		sum=sum+y;
		count++;
	}
	return count;
}
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("enter 2 nos");
	int x=scn.nextInt();
	int y=scn.nextInt();
	int z=multiply(x,y);
	System.out.println("division is = "+z);
}
}
