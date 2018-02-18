public class Crow {
void drinkWater()
{
	Pot p=new Pot();
	Stone s=new Stone();
	System.out.println("Crow finds a pot with water");
	Water w=p.rise(s);
	w.getWater();
}
public static void main(String[] args) {
	System.out.println("Crow is thirsty and searches for water");
	Crow c=new Crow();
	c.drinkWater();
	System.out.println("Crow quenches thirst and leaves happily");
}
}
