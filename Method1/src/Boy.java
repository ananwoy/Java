public class Boy {
void takegive()
{
	Friend f=new Friend();
	Money m=f.give();
	m.value=m.value/2;
	Brother b=new Brother();
	b.take(m);
	}
public static void main(String[] args) {
	Boy b=new Boy();
	b.takegive();
}
}
