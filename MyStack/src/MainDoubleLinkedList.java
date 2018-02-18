
public class MainDoubleLinkedList {
public static void main(String[] args) {
	DoublyLinkedList dl=new DoublyLinkedList();
	dl.add("jsp");
	dl.add("qsp");
	dl.add("rsp");
	dl.addFirst("nsp");
	dl.display();
	dl.add("BTM");
	dl.remove(2);
	System.out.println("\n--------------------");
	dl.display();
	
}
}
