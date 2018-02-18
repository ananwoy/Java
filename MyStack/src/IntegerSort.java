import java.util.TreeSet;

public class IntegerSort {
public static void main(String[] args) {
	TreeSet ts=new TreeSet(new Descending());
	ts.add(12);
	ts.add(13);
	ts.add(19);
	ts.add(17);
	ts.add(18);
	ts.add(11);
	ts.add(10);
	for (Object obj : ts) {
		System.out.println(obj);
	}
}
}
