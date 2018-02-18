
public class Employee implements Comparable {
String ename;
int eid;
double sal;
int age;
public Employee(String ename,int eid,double sal, int age)
{
	this.ename=ename;
	this.age=age;
	this.sal=sal;
	this.eid=eid;
}
public int compareTo(Object obj)
{
	if(obj instanceof Student)
	{
		Student s=(Student)obj;
		if(this.age>s.age)
			return 1;
		else
			return -1;
	}
	else
	{
		Employee e=(Employee)obj;
		if(this.age>e.age)
			return 1;
		else
			return -1;
	}
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", sal=" + sal + ", age=" + age + "]";
}
}
