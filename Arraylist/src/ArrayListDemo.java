import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListDemo
{
	public static void main(String[] args) {
		ArrayList al=new ArrayList(5);
		al.add("Rajesh");
		al.add("Suresh");
		al.add("Ramesh");
		al.add("Ropesh");
		Iterator it = al.iterator();
		it.
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	System.out.println("----------------------");
	for(Object obj:al)
	{
		System.out.println(obj);
	}
	}
	
}