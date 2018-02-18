public class Ac {
	Cold start() {
		System.out.println("Ac gives cold air");
		Cold c = new Cold();
		return c;
	}

	public static void main(String[] args) {
		Ac a = new Ac();
		System.out.println("start");
		a.start();
		System.out.println("stop");
	}
}
