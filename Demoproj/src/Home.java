public class Home {
	Shelter start() {
		System.out.println("Home gives shelter");
		Shelter s = new Shelter();
		return s;
	}

	public static void main(String[] args) {
		Home h = new Home();
		System.out.println("start");
		h.start();
		System.out.println("stop");
	}
}
