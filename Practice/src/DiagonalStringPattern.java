import java.util.Scanner;
public class DiagonalStringPattern {
public static void main(String[] args) {
	System.out.println("Enter the string:");
	Scanner scn=new Scanner(System.in);
	String st=scn.next();
	makeDiagonal(st);
}

private static void makeDiagonal(String st) {
	char ch[]=st.toCharArray();
	for (int i = 0; i < ch.length; i++) {
		for (int j = 0; j < ch.length; j++) {
			if(i==j||i+j==ch.length-1)
				System.out.print(ch[i]);
			else
				System.out.print(" ");
		}
		System.out.println();
	}
}
}
