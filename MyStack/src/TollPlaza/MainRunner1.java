package TollPlaza;

public class MainRunner1 {
public static void main(String[] args) {
	PrivateVehicle pv=new PrivateVehicle("TS092098");
	CommercialVehicle cv=new CommercialVehicle("TS8734283");
	TollData td=new TollData();
	td.makeEntry(pv,"Private","National");
	td.makeEntry(cv,"Commercial","Local");
	System.out.println("total commercial countis:"+td.getTotalCommercial());
	System.out.println("");
}
}
