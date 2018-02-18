public class Generator {
	Electricity start() {
		System.out.println("Generator gives electricity");
		Electricity e = new Electricity();
		return e;
	}

	public static void main(String[] args) {
		Generator g = new Generator();
		System.out.println("start");
		g.start();
		System.out.println("stop");
	}
}
