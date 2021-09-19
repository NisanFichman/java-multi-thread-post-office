
public class SmallPackage extends Package {
	boolean acknowledge;
	
	SmallPackage(Priority priority, Address senderAddress, Address destinationAdress, boolean acknowledge) {
		super(priority,senderAddress,destinationAdress);
		this.acknowledge=acknowledge;
	}

}
