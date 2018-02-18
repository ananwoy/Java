package bank;

public class AxisBank implements Bank {
	double interest;
	AxisBank(double interest) {
		this.interest = interest;
	}

	@Override
	public String toString() {
		return "AxisBank [interest=" + interest + "]";
	}

	@Override
	public double getInterest() {
		return interest;
	}

}
