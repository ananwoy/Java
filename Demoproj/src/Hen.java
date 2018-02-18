public class Hen {
	Eggs start() {
		System.out.println("Hen gives eggs");
		Eggs e = new Eggs();
		return e;
	}

	public static void main(String[] args) {
		Hen h = new Hen();
		System.out.println("start");
		h.start();
		System.out.println("stop");
	}
}
