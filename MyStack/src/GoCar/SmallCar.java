package GoCar;


public class SmallCar extends Car{
		
	public SmallCar(){
		this.type = "SMALL";
	}
	
	public float calculatePrice(float kms){
		return ((SMALL_CAR_FARE*kms)+INT_BASE_FARE);
	}
}
