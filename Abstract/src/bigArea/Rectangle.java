package bigArea;

public class Rectangle implements Shape {
double length, breadth;
public Rectangle(double length, double breadth)
{
	super();
	this.length=length;
	this.breadth=breadth;
}
@Override
public double getArea() {
	return length*breadth;
}
@Override
public String toString() {
	return "Rectangle [length=" + length + ", breadth=" + breadth + "]";
}
}
