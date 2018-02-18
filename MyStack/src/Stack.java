
public class Stack {
Object stk[];int cap, top=-1;
Stack(int cap)
{
	this.cap=cap;
	stk=new Object[cap];
}
	public boolean push(Object obj)
	{
		if(top==cap-1)
		{
			System.out.println("stack overflow");
			return false;
		}
		stk[++top]=obj;
		return true;
	}
	public int size()
	{
		return top+1;
	}
	public Object pop()
	{
		if(top==-1)
		{
			System.out.println("stack overflow");
			return null;
		}
		return stk[top--];
	}
	public Object peek()
	{
		if(top==-1)
		{
			System.out.println("stack underflow");
			return null;
		}
		return stk[top];
	}
	public String toString()
	{
		String st="[";
		for (int i = 0; i <= top; i++) {
			st=st+stk[i]+",";
		}
		return st+"]";
	}
}

