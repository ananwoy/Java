
public class SingleLinkedList {
	class Node {
		Object data;
		Node next;

		Node(Object data) {
			this.data = data;
		}
	}

	Node head;

	boolean add(Object obj) {
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
		return true;
	}
	boolean addFirst(Object data)
	{
		Node n=new Node(data);
		n.next=head;
		head=n;
		return true;
	}
	boolean add(Object obj, int in)
	{
		Node n=new Node(obj);
		Node t=head;
		int i=0;
		while(t!=null)
		{
			i++;
			if(i==in)
				break;
			t=t.next;
		}
		n.next=t.next;
		t.next=n;
		return true;
	}

	@Override
	public String toString() {
		String st = "";
		Node t = head;
		while (t != null) {
			st = st + t.data + "->";
			t = t.next;
		}
		return st;
	}
}
