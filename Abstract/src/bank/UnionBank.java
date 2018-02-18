package bank;

public class UnionBank implements Bank {
	double interest;
	UnionBank(double interest) {
		this.interest = interest;
	}

	@Override
	public String toString() {
		return "UnionBank [interest=" + interest + "]";
	}

	@Override
	public double getInterest() {
		return interest;
	}

}
