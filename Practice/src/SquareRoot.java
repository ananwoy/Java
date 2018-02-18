
public class SquareRoot {
	static int floorSqrt(int x)
	{
		int i=1;
	    while(i*i<=x)
	    {
	    	i++;
	    }
	    return i-1;
	}
	public static void main(String[] args) {
		int x=floorSqrt(99);
		System.out.println(x);
	}
}
