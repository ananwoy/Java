
public class InitCap {
	static String initCap(String A)
    {
        char A1[]=A.toCharArray();
        A1[0]=(char)(A1[0]-32);
        return new String(A1);
    }
	public static void main(String[] args) {
		String A="hello";
		String B="world";
		System.out.println(initCap(A)+" "+initCap(B));
	}
}
