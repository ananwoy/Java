public class Whatsapp {
	Messages start() {
		System.out.println("Whatsapp gives messages");
		Messages m = new Messages();
		return m;
	}

	public static void main(String[] args) {
		Whatsapp w = new Whatsapp();
		System.out.println("start");
		w.start();
		System.out.println("stop");
	}
}
