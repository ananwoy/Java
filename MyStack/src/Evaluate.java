import java.util.Scanner;
import java.util.Stack;

public class Evaluate {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the postfix expression");
	String st=sc.next();
	double res=evaluate(st);
	System.out.println("Evaluated result: "+res);
}

private static double evaluate(String st) {
	char ch[]=st.toCharArray();
	Stack<Double> stk=new Stack<Double>();
	Scanner sc=new Scanner(System.in);
	for (int i = 0; i < ch.length; i++) {
		if(ch[i]>=97&&ch[i]<=122||ch[i]>=65&&ch[i]<=97)
		{
			System.out.println("enter the value for : " +ch[i]);
			stk.push(sc.nextDouble());
		}
		else
		{
			switch(ch[i])
			{
			case '+':
				stk.push(stk.pop()+stk.pop());
				break;
			case '-':
				stk.push(-stk.pop()+stk.pop());
				break;
			case '*':
				stk.push(stk.pop()*stk.pop());
				break;
			case '/':
				stk.push(1/(stk.pop()/stk.pop()));
				break;	
				}
		}
	}
	return stk.peek();
}
}
