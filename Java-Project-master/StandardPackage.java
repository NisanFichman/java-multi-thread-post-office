
public class StandardPackage extends Package{
	double weight;
	StandardPackage (Priority priority, Address senderAddress, Address destinationAdress,double weight) {
		super(priority,senderAddress ,destinationAdress );
		this.weight=weight;
	}
	

}
