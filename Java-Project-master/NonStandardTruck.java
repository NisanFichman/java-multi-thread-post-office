import java.util.Random;

public class NonStandardTruck extends Truck implements Node{
	int width;
	int length;
	int height;
	public NonStandardTruck(){
		super();
		Random rand = new Random();
		this.width=rand.nextInt(500);
		this.length=rand.nextInt(1000);
		this.height=rand.nextInt(500);
		System.out.println("Creating NonStandartTruck["+"truckID="+Truck.getTruckID()+", licensePlate="+this.getLicensePlate()+", truckModel="+this.getTruckModel()+", available="+this.getAvailable()+"length="+this.getLength()+", Width= "+this.getWidth()+", height= "+this.getHeight()+"]");
		//Creating NonStandardTruck [truckID=2004, licensePlate=730-50-386, truckModel=M2, available= true, length=1400, width=400, height=300]
	}
	public NonStandardTruck(String licensePlate, String truckModel, int length, int width, int height) 
	{
		super();
		this.length=length;
		this.width=width;
		this.height=height;
		
	}	
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deliverPackage(Package p) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void collectPackage(Package p) {
		// TODO Auto-generated method stub
		
	}

}
