public class Life {
	Pain start() {
		System.out.println("Life gives pain");
		Pain p = new Pain();
		return p;
	}

	public static void main(String[] args) {
		Life l = new Life();
		System.out.println("start");
		l.start();
		System.out.println("stop");
	}
}

class Pain {

}