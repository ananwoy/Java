
public class Bike {
	Smoke startBike() {
		Smoke s = new Smoke();
		System.out.println("Bike is started and smoke is released air is polluted");
		return s;
	}

	public static void main(String[] args) {
		Bike b = new Bike();
		b.startBike();
	}
}
