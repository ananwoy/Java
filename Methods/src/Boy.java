public class Boy {
void buyGive()
{
	Shop s=new Shop();
	Money m=new Money();
	m.value=50;
	Chocolate c=s.sell(m);
	Girl g=new Girl();
	System.out.println("Boy gives chocolate of rs "+m.value);
	g.take(c);
	
}
public static void main(String[] args) {
	Boy b=new Boy();
	b.buyGive();
}
}
