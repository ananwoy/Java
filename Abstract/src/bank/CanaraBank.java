package bank;

public class CanaraBank implements Bank {
	double interest;
	CanaraBank(double interest) {
		this.interest = interest;
	}

	@Override
	public double getInterest() {
		return interest;
	}

	@Override
	public String toString() {
		return "CanaraBank [interest=" + interest + "]";
	}

}
