import java.util.Scanner;
import java.util.Stack;

public class BalancedString {
static boolean  isBalanced(String st)
{
	char ch[]=st.toCharArray();
	Stack<Character> stk=new Stack<Character>();
	for (int i = 0; i < ch.length; i++) {
		if(ch[i]=='('||ch[i]=='{'||ch[i]=='[')
			stk.push(ch[i]);	
	else if(!stk.isEmpty())
	{
		switch(ch[i])
		{
		case ')':
			if(stk.pop()!='(')
				return false;
			break;
		case '}':
			if(stk.pop()!='{')
				return false;
			break;
		case ']':
			if(stk.pop()!='[')
				return false;
			break;
		default:
			return false;
		}
}
	}
return stk.isEmpty();
}
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	String st=scn.next();
	boolean x=isBalanced(st);
	if(x)
		System.out.println("Stirng is balanced");
	else
		System.out.println("String is not balanced");
}
}
