
public class Wolf {
void getMeat()
{
	Crow c=new Crow();
	Howl h=new Howl();
	System.out.println("Wolf howls at crow and crow opens mouth");
	Meat m=c.drop(h);
	m.getMeat();
}
public static void main(String[] args) {
	Wolf w=new Wolf();
	System.out.println("Wolf sees crow with meat");
	w.getMeat();
	System.out.println("Wolf takes meat and flees");
}
}
