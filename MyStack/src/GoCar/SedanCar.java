package GoCar;

public class SedanCar extends Car {
	
	public SedanCar(){
		this.type = "SEDAN";
	}
	
	public float calculatePrice(float kms){
		return ((SEDAN_CAR_FARE*kms)+INT_BASE_FARE);
	}
}
