import java.util.Random;

public class NonStandardPackage extends Package {
		int width;
		int length;
		int height;

		public NonStandardPackage(Priority priority, Address senderAddress,Address destinationAdress,int width, int length, int height) {
			super(priority,senderAddress,destinationAdress);
			this.width=width;
			this.length=length;
			this.height=height;
			
		}

}
