
public class Van extends Truck implements Node{
	public Van() {
		super();
		System.out.println("Creating Van["+"truckID="+Truck.getTruckID()+", licensePlate="+this.getLicensePlate()+", truckModel="+this.getTruckModel()+", available="+this.getAvailable()+"]");

	}
	public Van(String licensePlate, String truckModel) {
		super();
		this.licensePlate=licensePlate;
		this.truckModel=truckModel;
		System.out.println("Creating Van["+"truckID="+Truck.getTruckID()+", licensePlate="+this.getLicensePlate()+", truckModel="+this.getTruckModel()+", available="+this.getAvailable()+"]");

		
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
