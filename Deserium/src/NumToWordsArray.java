import java.util.Scanner;
public class NumToWordsArray {
static void nTow(int n, String st)
{
	String one[]= {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
	String two[]= {"","","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
	if(n>19)
		System.out.print(two[n/10]+ " "+one[n%10]+" ");
	else
		System.out.print(one[n]+" ");
	if(n!=0)
		System.out.print(st+" ");
}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter number:");
	int n=s.nextInt();
	nTow(n/10000000%100,"Crore");
	nTow(n/100000%100,"Lakh");
	nTow(n/1000%100, "Thousand");
	nTow(n/100%10,"Hundred");
	nTow(n%100,"");
	s.close();
}
}
