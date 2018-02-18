
public class Student implements Comparable {
int sid;
String name;
double perc;
int age;
public Student(int sid,String name,double perc,int age)
{
	this.sid=sid;
	this.name=name;
	this.perc=perc;
	this.age=age;
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
	return "Student [sid=" + sid + ", name=" + name + ", perc=" + perc + ", age=" + age + "]";
}
}

