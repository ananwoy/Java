
public class DoublyLinkedList {
	class Node {
		Object data;
		Node next, prev;

		Node(Object data) {
			this.data = data;
		}
	}

	Node head;

	public boolean add(Object obj) {
		Node n = new Node(obj);
		if (head == null) {
			head = n;
			return true;
		}
		Node t = head;
		while (t.next != null) {
			t = t.next;
		}
		t.next = n;
		n.prev = t;
		return true;
	}

	boolean addFirst(Object obj) {
		Node n = new Node(obj);
		if (head == null) {
			head = n;
			return true;
		}
		n.next = head;
		head.prev = n;
		head = n;
		return true;
	}

	Object removeFirst() {
		if (head == null) {
			System.out.println("list is empty");
			return "";
		}
		Object ob = head.data;
		head = head.next;
		head.prev = null;
		return ob;

	}

	Object removeLast() {
		if (head == null) {
			System.out.println("list is empty");
			return "";
		}
		Node t = head;
		while (t.next != null) {
			t = t.next;
		}
		Object ob = t.data;
		if (t == head) {
			head = null;
		} else
			t.prev.next = null;

		return ob;
	}

	Object remove(int i) {
		int count = 0;
		Node t = head;
		while (t.next != null) {
			if (i == count)
				break;
			count++;
			t = t.next;
		}
		if(i>count)
		{
			System.out.println("index not in range");
		}
		Object ob = t.data;
		if (head == t) {
			head = head.next;
			head.prev = null;
		} else {
			t.prev.next = t.next;
			if(t.next!=null)
			t.next.prev = t.prev;
		}
		return ob;
	}
	public boolean add(Object obj,int in)
	{
		Node n=new Node(obj);
		int count = 0;
		Node t = head;
		while (t.next != null) {
			if (in == count)
				break;
			count++;
			t = t.next;
		}
		if(in>count)
		{
			System.out.println("index not in range");
		}
		Object ob = t.data;
		if (head == t) {
			head.next = t.next.prev;
			head.prev = null;
		} else {
			t.prev.next = n.prev;
			n
			if(t.next!=null)
			t.next.prev = t.prev;
		}
		return ob;
	}

	/*Object getFirst() {

	}

	Object getLast() {

	}*/
	void display()
	{
		Node t=head;
		while(t!=null)
		{
			System.out.print(t.data);
			t=t.next;
			if(t!=null)
				System.out.print("<==>");
		}
	}
}