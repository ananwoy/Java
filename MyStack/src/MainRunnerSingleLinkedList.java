
public class MainRunnerSingleLinkedList {
	public static void main(String[] args) {
		
SingleLinkedList sl=new SingleLinkedList();
sl.add(23);
sl.add("AB");
sl.add("jsp");
System.out.println(sl);
sl.addFirst("qsp");
sl.add("ram",0);
System.out.println(sl);
}
}