import java.util.Collection;
import java.util.Iterator;
public class MyArrayListOwn implements Collection
{
	Object lists[];
	int cap,size=0;
	MyArrayListOwn()
	{
		cap=10;
		lists=new Object[cap];
	}
	MyArrayListOwn(int size)
	{
		this.cap=cap;
		lists=new Object[cap];
	}

@Override
public boolean add(Object e) {
	try
	{
		if(this.size==this.cap)
		{
			this.cap=(this.cap*3/2)+1;
			Object nl[]=new Object[this.cap];
			for (int i = 0; i < lists.length; i++) {
				nl[i]=lists[i];
			}
			lists=nl;
		}
		lists[size++]=e;
		return true;
	}
	catch (Exception ee) {
		return false;
	}
}

@Override
public boolean addAll(Collection c) {
	try
	{
		Object ob[]=c.toArray();
		for (int i = 0; i < ob.length; i++) {
			lists[i]=add(ob[i]);
		}
	}
	catch(Exception e)
	{
	return false;
	}
	return true;
}

@Override
public void clear() {
	size=0;
	cap=10;
	lists=new Object[cap];
}

@Override
public boolean contains(Object o) {
	for (int i = 0; i <=size; i++) {
		if(lists[i]==o)
			return true;
	}
	return false;
}

@Override
public boolean containsAll(Collection arg0) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean isEmpty() {
	return size==0;
}

@Override
public Iterator iterator() {
	class MyIt implements Iterator
	{
		int cursor=0;
		@Override
		public boolean hasNext() {
			return cursor<size;
		}

		@Override
		public Object next() {
			return lists[cursor++];
		}
		
	}
	return new MyIt();
}

@Override
public boolean remove(Object o) {
	for (int i = 0; i < lists.length; i++) {
		if(lists[i]==o)
		{
			for(int j=i+1;j<size;j++)
				lists[j-1]=lists[j];
		}
		size--;
		return true;
	}
	return false;
}

@Override
public boolean removeAll(Collection arg0) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean retainAll(Collection arg0) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public int size() {
	return size;
}

@Override
public Object[] toArray() {
	Object ob[]=new Object[size];
	for (int i = 0; i < ob.length; i++) {
		ob[i]=lists[i];
	}
	return ob;
}

@Override
public Object[] toArray(Object[] arg0) {
	// TODO Auto-generated method stub
	return null;
}
public static void main(String[] args) {
	MyArrayListOwn mlo=new MyArrayListOwn();
	mlo.add("Ram");
	mlo.add("Raju");
	mlo.add("ramu");
	while (.hasNext()) {
		
	}
}
}
