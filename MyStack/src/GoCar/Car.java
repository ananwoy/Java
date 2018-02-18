package GoCar;
public abstract class Car {
	public float SMALL_CAR_FARE = 10.00f;
	public float SEDAN_CAR_FARE = 15.00f;
	public float INT_BASE_FARE = 50.00f;
	public String regNo;
	public String type;
	public String driverName;
	
	public abstract float calculatePrice(float kms);
	
	public String getRegNo(){
		return this.regNo;
	}
	
	public String getDriverName(){
		return this.driverName;
	}
	
	public String getType(){
		return this.type;
	}
	
	public void setRegNo(String regNo){
		this.regNo = regNo;
	}
	
	public void setDriverName(String driverName){
		this.driverName = driverName;
	}
	
	public void setType(String type){
		this.type = type;
	}
}
