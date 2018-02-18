package department;

public class Chemical implements Department{
String name;
String subs[]= {"Organic","Inorganic","Mass Transfer"};
public Chemical(String name)
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
