package bank;

public class HDFCBank implements Bank {
	double interest;
	HDFCBank(double interest) {
		this.interest = interest;
	}

	@Override
	public double getInterest() {
		return interest;
	}

	@Override
	public String toString() {
		return "HDFCBank [interest=" + interest + "]";
	}

}
