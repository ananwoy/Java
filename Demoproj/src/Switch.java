import java.util.Scanner;

public class Switch
{
	static void display()
	{
		System.out.println("hello");
	}
	static void show()
	{
		System.out.println("Hola");
	}
	static void greet()
	{
		System.out.println("greetings");
	}
	static void bye()
	{
		System.out.println("goodbye");
	}
	public static void main(String[] args) {
		
	
	Scanner s=new Scanner(System.in);
	int i=s.nextInt();
switch(i)
{
	case 1:display();
	break;
	case 2:show();
	break;
	case 3:greet();
	break;
	default:bye();
	
	}
	}

}