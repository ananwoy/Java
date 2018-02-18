public class Fire {
	Heat start() {
		System.out.println("Fire gives heat");
		Heat h = new Heat();
		return h;
	}

	public static void main(String[] args) {
		Fire f = new Fire();
		System.out.println("start");
		f.start();
		System.out.println("stop");
	}
}
