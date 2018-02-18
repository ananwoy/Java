public class Bulb {
Light start() {
		System.out.println("Bulb gives light");
		Light l = new Light();
		return l;
	}

	public static void main(String[] args) {
		Bulb b = new Bulb();
		System.out.println("start");
		b.start();
		System.out.println("stop");
	}
}
