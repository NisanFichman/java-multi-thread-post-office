import java.util.Random;

public abstract class Truck {
	private static int truckID=2000;
	String licensePlate,truckModel;
	Boolean available;
	int timeLeft;
	Package[] packages;
	public Truck() {
		
		Truck.truckID++;
		this.licensePlate=this.toLicensePlate();
		this.truckModel=this.toModel();
		this.available=false;
		
		
		

		
	}
	public Truck(String licensePlate, String truckModel) {
		this.licensePlate=licensePlate;
		this.truckModel=truckModel;
	}
	public String  toLicensePlate() {
		Random rand = new Random();
		return (rand.nextInt(900)+100)+"-"+(rand.nextInt(90)+100)+"-"+(rand.nextInt(900)+100);
	}
	public String toModel() {
		Random rand = new Random();
		return "M"+rand.nextInt(4);
		
	}
	public static int getTruckID() {
		return truckID;
	}
	public static void setTruckID(int truckID) {
		Truck.truckID = truckID;
	}
	public String getLicensePlate() {
		return licensePlate;
	}
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	public String getTruckModel() {
		return truckModel;
	}
	public void setTruckModel(String truckModel) {
		this.truckModel = truckModel;
	}
	public Boolean getAvailable() {
		return available;
	}
	public void setAvailable(Boolean available) {
		this.available = available;
	}
	public int getTimeLeft() {
		return timeLeft;
	}
	public void setTimeLeft(int timeLeft) {
		this.timeLeft = timeLeft;
	}
	

}
