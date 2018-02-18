package bigArea;

public class MainRunner {
public static void main(String[] args) {
	Shape s[]= {new Circle(3.5),new Square(4.5), new Circle(5.3), new Square(4.5), new Rectangle(4.3,5.3)};
	Shape big=biggestAreaShape(s);
	System.out.println("Biggest Area Shape: ");
	if(big instanceof Circle)
	{
	Circle c=(Circle)big;	
	System.out.println("Circle with radius : "+c.radius);	
	}
	else if(big instanceof Square)
	{
		Square s1=(Square)big;
		System.out.println("Square with side :"+s1.side);
	}
	else if(big instanceof Rectangle)
	{
		Rectangle ra=(Rectangle)big;
		System.out.println("Rectangle with length: "+ra.length+" and breadth "+ra.breadth);
	}
	System.out.println("Area is: "+big.getArea()+" of "+big);
}

private static Shape biggestAreaShape(Shape[] s) {
Shape bs=s[0];
for (int i = 1; i < s.length; i++) {
	if(bs.getArea()<s[i].getArea())
		bs=s[i];
}
	return bs;
}
}
