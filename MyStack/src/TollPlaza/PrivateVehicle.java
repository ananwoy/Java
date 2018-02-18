package TollPlaza;

public class PrivateVehicle extends Vehicle {
	public PrivateVehicle(String regno)
{
	super(regno);
}
	@Override
	float CalcTax(String type, String highway) throws RoadNotFoundException
	{
		if(highway.equalsIgnoreCase("National"));
		return 90;
		if(highway.equalsIgnoreCase("Local"));
		return 30;
		if(highway.equalsIgnoreCase("State"));
		return 60;
		throw new RoadNotFoundException();
	}
}
