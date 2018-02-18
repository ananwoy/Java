import java.util.Iterator;
import java.util.TreeSet;


public class StudentEmployeeRunner {
public static void main(String[] args) {
	TreeSet ts=new TreeSet();
	ts.add(new Student(3,"Guldu",34.1,34));
	ts.add(new Student(1,"Chaman",32.1,31));
	ts.add(new Student(5,"Dinga",71.1,23));
	ts.add(new Student(4,"Mangu",42.1,21));
	ts.add(new Student(1,"Pinga",37.1,31));
	ts.add(new Employee("Chaman",2,32000,31));
	ts.add(new Employee("Alu",6,34000,33));
	Iterator it=ts.iterator();
	while(it.hasNext())
		System.out.println(it.next());
	 TreeSet te= new TreeSet(new Decreasing());
	te.add(new EmployeeTS("golu",123));
	te.add(new EmployeeTS("ramu",345));
	Iterator ms=te.iterator();
	while(ms.hasNext());
	System.out.println(ms.next());
	}
	


}
