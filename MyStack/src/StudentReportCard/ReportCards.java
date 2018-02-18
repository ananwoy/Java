package StudentReportCard;

import java.util.TreeSet;

public class ReportCards {
	TreeSet stdset = new TreeSet();
	public boolean add(StudentReport s) {
		stdset.add(s);
		return true;
	}

	public void display() {
		System.out.println("<-----------Student Result Sheet---------->");
		System.out.println("===========================================");
		System.out.println("RollNo Name Phy Chem Maths Bio Total Per Result");
		System.out.println("===========================================");
		for (Object obj : stdset) {
			System.out.println(obj);
		}
		System.out.println("===========================================");
	}

	public void getReport(int rollno) {
		StudentReport s = null;
		for (Object obj : stdset) {
			if (((StudentReport) obj).getSroll() == rollno)
				s = (StudentReport) obj;
		}
		if (s == null) {
			System.out.println("Result not found:");
			return;
		}
		System.out.println("<------REPORT CARD--------->");
		System.out.println("<-------------------------->");
		System.out.println("NAME:    " + s.getSname()+"        RANK: "+getRank(s));
		System.out.println("ROLL NO: " + s.getSroll());
		System.out.println("----------------------------");
		System.out.println("SUB   MAX  MIN  OBT  CLASSMAX");
		System.out.println("----------------------------");
		System.out.println("PHY   100  40   " + s.getPhy() + "    " + maxPhy());
		System.out.println("CHEM  100  40   " + s.getChem() + "    " + maxChem());
		System.out.println("MATHS 100  40   " + s.getMaths() + "    " + maxMaths());
		System.out.println("BIO   100  40   " + s.getBio() + "    " + maxBio());
		System.out.println("-----------------------------");
		System.out.println("Total 400 160  " + s.getTotal() + "  " + maxHighest());
		System.out.println("-----------------------------");
		System.out.println("Percentage:   "+s.getPerc());
		System.out.println("Result:       "+s.getResult());
		System.out.println("-----------------------------");
	}

	private double maxPhy() {
		double marks = 0;
		for (Object obj : stdset) {
			double m = ((StudentReport) obj).getPhy();
			if (m > marks)
				marks = m;
		}
		return marks;
	}

	private double maxChem() {
		double marks = 0;
		for (Object obj : stdset) {
			double m = ((StudentReport) obj).getChem();
			if (m > marks)
				marks = m;
		}
		return marks;
	}

	private double maxMaths() {
		double marks = 0;
		for (Object obj : stdset) {
			double m = ((StudentReport) obj).getMaths();
			if (m > marks)
				marks = m;
		}
		return marks;
	}

	private double maxBio() {
		double marks = 0;
		for (Object obj : stdset) {
			double m = ((StudentReport) obj).getBio();
			if (m > marks)
				marks = m;
		}
		return marks;
	}

	private double maxHighest() {
		double marks = 0;
		for (Object obj : stdset) {
			double m = ((StudentReport) obj).getTotal();
			if (m > marks)
				marks = m;
		}
		return marks;
	}
	private int getRank(StudentReport s)
	{
		double perc=s.getPerc();
		int rank=1;
		for (Object obj : stdset) {
			double m=((StudentReport)obj).getPerc();
			if(m>perc)
			{
				rank++;
			}
			}
		return rank;
		
	}
	public void getBest()
	{
		for (Object obj : stdset) {
			StudentReport s=(StudentReport)obj;
			int r=getRank(s);
			if(r==1)
				getReport(s.getSroll());
		}
	}
	}

