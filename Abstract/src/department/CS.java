package department;

public class CS implements Department{
	String name;
	String subs[]= {"C++","DBMS","Cloud Computing"};
			
	public CS(String name)
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
