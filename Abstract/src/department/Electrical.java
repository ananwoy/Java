package department;

public class Electrical implements Department{
	String name;
	String subs[]= {"NAS","EMT","BCE"};
	public Electrical(String name)
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
