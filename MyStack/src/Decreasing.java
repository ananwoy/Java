import java.util.Comparator;

public class Decreasing implements Comparator<EmployeeTS>{


	@Override
	public int compare(EmployeeTS e1, EmployeeTS e2) {
		// TODO Auto-generated method stub
		return e1.eid-e2.eid;
	}

}
