public class YouTube {
	Video start() {
		System.out.println("YouTube shows video");
		Video v = new Video();
		return v;
	}

	public static void main(String[] args) {
		YouTube y= new YouTube();
		System.out.println("start");
		y.start();
		System.out.println("stop");
	}
}
