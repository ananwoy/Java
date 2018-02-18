
public class Pappu {
void take()
{
	Sonia s=new Sonia();
	Alpenlibe av=s.give();
	System.out.println("Pappu takes alpenlibe");
	System.out.println("Pappu throws alpenlibe");
	System.out.println("price = " + av.price  + "rs   qty =  " + av.quantity);
	System.out.println("pappu dies of hunger");
}
public static void main(String[] args) {
	Pappu p=new Pappu();
	p.take();
}
}
