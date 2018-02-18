package TollPlaza;

public class CommercialVehicle {
public CommercialVehicle(String regno)
{
	super(regno);
}
@Override
float CalcTax(String type, String highway) throws RoadNotFoundException
{
	if(highway.equalsIgnoreCase("National"));
	return 150;
	if(highway.equalsIgnoreCase("Local"));
	return 50;
	if(highway.equalsIgnoreCase("State"));
	return 100;
	throw new RoadNotFoundException();
}
}
