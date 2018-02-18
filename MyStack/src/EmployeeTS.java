import java.util.Comparator;

public class EmployeeTS{
	String ename;
	int eid;
	EmployeeTS(String ename,int eid)
	{
		this.ename=ename;
		this.eid=eid;
	
	}
	@Override
	public String toString() {
		return "EmployeeTS [ename=" + ename + ", eid=" + eid + "]";
	}

}
