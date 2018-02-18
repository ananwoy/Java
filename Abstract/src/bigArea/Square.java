package bigArea;

public class Square implements Shape {
double side;
@Override
public double getArea()
{
	return side*side;
}
Square(double side)
{
	this.side=side;
}
@Override
public String toString() {
	return "Square [side=" + side + "]";
}
}
