package bank;

public class SBI implements Bank{
	double interest;
	SBI(double interest)
	{
		this.interest=interest;
	}
	@Override
	public double getInterest() {
		return interest;
	}
	@Override
	public String toString() {
		return "SBI [interest=" + interest + "]";
	}

}
