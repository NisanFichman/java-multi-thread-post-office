
public class StandardTruck extends Truck implements Node{
	int maxWeight;
	Branch destination;
	public StandardTruck() {
		super();
		this.maxWeight=400;
		System.out.println("Creating StandartTruck["+"truckID="+Truck.getTruckID()+", licensePlate="+this.getLicensePlate()+", truckModel="+this.getTruckModel()+", available="+this.getAvailable()+", maxWeight= "+this.getMaxWeight()+"]");

		
	}
	public StandardTruck(String licensePlate,String truckModel,int maxWeight) {
		super();
		this.licensePlate=licensePlate;
		this.truckModel=truckModel;
		this.maxWeight=400;
		//Creating StandartTruck [truckID=2002, licensePlate=639-41-991, truckModel=M0, available= true,maxWeight=200]
		System.out.println("Creating StandartTruck["+"truckID="+Truck.getTruckID()+", licensePlate="+this.getLicensePlate()+", truckModel="+this.getTruckModel()+", available="+this.getAvailable()+", maxWeight= "+this.getMaxWeight()+"]");

		
	}
	public int getMaxWeight() {
		return maxWeight;
	}
	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
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
