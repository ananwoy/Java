public class P13 {
	public static void main(String[] args) {
		int i = 10;
		if ((++i == 11) && (i++ == 11)) {
			System.out.println("from if");
			i++;
		}
		System.out.println("end of main");
		System.out.println(i);
	}

}
