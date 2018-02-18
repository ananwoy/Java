public class Sun {
	Sunlight start() {
		System.out.println("Sun gives sunlight");
		Sunlight s = new Sunlight();
		return s;
	}

	public static void main(String[] args) {
		Sun su = new Sun();
		System.out.println("start");
		su.start();
		System.out.println("stop");
	}
}
