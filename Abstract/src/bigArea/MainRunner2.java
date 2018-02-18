package bigArea;

public class MainRunner2 {
public static void main(String[] args) {
	Shape s[]= {new Circle(3.5),new Square(4.5), new Circle(5.3), new Square(4.5), new Rectangle(4.3,5.3)};
	Shape big=biggestAreaShape(s);
	System.out.println("-----Shapes information------");
	for (int i = 0; i < s.length; i++) {
		System.out.println(s[i]+" Area is: "+s[i].getArea());
	}
	System.out.println("\n\nBiggest Area Shape: ");
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
