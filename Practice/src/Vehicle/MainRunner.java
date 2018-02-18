package Vehicle;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MainRunner {

    static String hackerrankInString(String s) {
    String st="hackerrank";
        char ch[]=st.toCharArray();
        char c[]=s.toCharArray();
        int j=0,count=0;
        for(int i=0;i<ch.length;i++)
        {
            while(j<c.length)
            {
                if(ch[i]==c[j])
                {
                    count++;
                    break;
                }
                j++;
            }
    }
        if(count==ch.length)
            return "YES";
        return "NO";
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = hackerrankInString(s);
            System.out.println(result);
        }
        in.close();
    }
}
