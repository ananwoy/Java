import java.io.*;
	import java.util.*;

public class Hackerrank {
	
	    static void sort(String st, String st1)
	{
		char ch[]=st.toCharArray();
		char ch1[]=st1.toCharArray();
		int i=0;
		while(i<ch.length&&i<ch1.length&&ch[i]==ch1[i])
			{
				i++;
			}
			if(i<ch.length&&i<ch1.length&&ch[i]>ch1[i])
			{
				System.out.println("Yes");
			}
	        else
	           	System.out.println("No");
	}
	    static String initCap(String A)
	    {
	        char A1[]=A.toCharArray();
	        A1[0]=(char)(A1[0]-32);
	        return new String(A1);
	    }

	    public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B=sc.next();
	        System.out.println(A.length()+B.length());
	        sort(A,B);
	        System.out.println(initCap(A)+" "+initCap(B));
	        
	        /* Enter your code here. Print output to STDOUT. */
	        
	    }
	}


