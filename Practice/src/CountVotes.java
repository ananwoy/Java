import java.util.Scanner;
public class CountVotes {
static String count(String ar[])
{
	int count[]=new int[ar.length];
	for (int i = 0; i < ar.length; i++) {
		for (int j = 0; j < ar.length; j++) {
			if(ar[i].equals(ar[j]))
				count[i]++;
		}
	}
	for (int i = 0; i < count.length; i++) {
		for (int j = i+1; j < count.length; j++) {
		if(count[i]<count[j])
		{
			int t=count[i];
			count[i]=count[j];
			count[j]=t;
			String ti=ar[i];
			ar[i]=ar[j];
			ar[j]=ti;
		}
	}
	}
	return ar[0];
}
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("enter number of elements");
	int a=scn.nextInt();
	String ar[]=new String[a];
	System.out.println("Enter the string:");
	for (int i = 0; i < ar.length; i++) {
	ar[i]=scn.next();	
	}
	String max=count(ar);
	System.out.println(max);
}
}
