
public abstract class Package {
	private static int packageID=1000;
	Status status;
	Priority priority;
	Address senderAddress,destinationAddress;
	Tracking[] tracking;
	public Package (Priority priority, Address senderAddress, Address destinationAdress) {
		Package.packageID++;
		this.priority= Priority.STANDARD;
		this.status=Status.CREATION;
		this.senderAddress=senderAddress;
		this.destinationAddress=destinationAdress;
		
	}

	void addTracking (Node node, Status status) {
		
	}
	void printTracking (){
		//int i;
		//for (i=0;i<this.tracking.length;i++);
		//System.out.println(this.tracking[i]);
	}
	

}
