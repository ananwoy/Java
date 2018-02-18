package department;

public class Electronics implements Department {
String name;
String subs[]= {"Sattelite Comm.","Microwave","VLSI"};
public Electronics(String name)
{
	this.name=name;
}

@Override
public String getName() {
	
	return name;
}
@Override
public String[] getSubjects() {
	return subs;
}
}