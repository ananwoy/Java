package TollPlaza;

public class Vehicle {
String regNo;
public Vehicle(String regNo)
{
	super();
	this.regNo=regNo;
}
abstract float calcTax(String type, String highway);
}
