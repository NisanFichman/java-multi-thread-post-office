
public class Address {
	int zip,street;
	 public Address(int zip, int street) {
		 int length = String.valueOf(street).length();
		 if (length==6) {
			 
			 this.zip=zip;
			 this.street=street; 
		 }
		 else 
		 {
			 System.out.println("Wrong Street number");
		 }
		
	 }
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public int getStreet() {
		return street;
	}
	public void setStreet(int street) {
		this.street = street;
	}

}
