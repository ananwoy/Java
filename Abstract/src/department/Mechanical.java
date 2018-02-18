package department;

public class Mechanical implements Department {
	String name;
	String subs[]= {"SOM","TOM","Thermodynamics"};
	public Mechanical(String name)
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
