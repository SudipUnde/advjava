package day9;

public class Engine {
	private String fuelType;
	private String power;
	public Engine() {
		// TODO Auto-generated constructor stub
	}
	public Engine(String fuelType, String power) {
		super();
		this.fuelType = fuelType;
		this.power = power;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	@Override
	public String toString() {
		return "Engine [fuelType=" + fuelType + ", power=" + power + "]";
	}

}
