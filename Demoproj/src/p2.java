public class p2
{
	public static void main(String[] args) {
		boolean flag=true;
		if((flag=true)&&(flag=false))
		{
			System.out.println("from if");
		}
	System.out.println("end of main");
	System.out.println(flag);}
}