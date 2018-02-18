package StudentReportCard;

import java.util.Scanner;

public class StudentReport implements Comparable {
	private int sroll;
	private String sname;
	private double phy, chem, maths, bio, perc;

	@Override
	public String toString() {
		return "StudentReport [sroll=" + sroll + " sname=" + sname + " phy=" + phy + " chem=" + chem + " maths=" + maths
				+ " bio=" + bio + " perc=" + perc + "]";
	}

	public int getSroll() {
		return sroll;
	}

	public String getSname() {
		return sname;
	}

	public double getPhy() {
		return phy;
	}

	public double getChem() {
		return chem;
	}

	public double getMaths() {
		return maths;
	}

	public double getBio() {
		return bio;
	}

	StudentReport(int sroll, String sname, double phy, double chem, double maths, double bio) {
		this.sroll = sroll;
		this.sname = sname;
		this.phy = phy;
		this.chem = chem;
		this.maths = maths;
		this.bio = bio;
		this.perc = (phy + chem + maths + bio) / 4;
	}

	static StudentReport readStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the roll no:");
		int rollno = sc.nextInt();
		System.out.println(" enter name:");
		String name = sc.next();
		System.out.println("enter four subject marks");
		double phy = sc.nextDouble();
		double chem = sc.nextDouble();
		double maths = sc.nextDouble();
		double bio = sc.nextDouble();
		StudentReport s = new StudentReport(rollno, name, phy, chem, maths, bio);
		return s;
	}

	public double getPerc() {
		return getTotal() / 4.0;
	}

	public double getTotal() {
		return phy + chem + maths + bio;
	}

	public String getResult() {
		if (phy < 40 || chem < 40 || maths < 40 || bio < 40)
			return "Fail";
		else {
			if (getPerc() >= 85)
				return "Distsinction";
			else if (getPerc() >= 60) {
				return "First class";
			} else if (getPerc() > 50) {
				return "Second class";
			} else
				return "Third class";
		}
	}

	@Override
	public int compareTo(Object obj) {
		StudentReport s=(StudentReport)obj;
		return this.sroll-s.sroll;
	}
}
