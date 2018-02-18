public class Cow {
	Milk start() {
		System.out.println("Cow gives milk");
		Milk m = new Milk();
		return m;
	}

	public static void main(String[] args) {
		Cow c = new Cow();
		System.out.println("start");
		c.start();
		System.out.println("stop");
	}
}
