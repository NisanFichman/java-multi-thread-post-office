
public class Branch implements Node{
	static int branchId=-1;
	String branchName;
	Truck[] listTrucks;
	Package[] listPackages;
	public Branch() {
		if(Branch.branchId==-1) {
			this.branchName="HUB";
			Branch.branchId+=1;
			System.out.print("Creating Branch -1, branch name:HUB, "+", packages: "+this.listPackages.length+ ", trucks: "+this.listTrucks.length);

		}
		else {
			this.branchName=""+Branch.branchId;
			Branch.branchId+=1;
			System.out.print("Creating Branch "+Branch.branchId+", branch name: "+Branch.branchId+", packages: "+this.listPackages.length+ ", trucks: "+this.listTrucks.length);

		}
	}
	public Branch(String branchName) {
		
	
		
	}
	public int getNumofPackage() {
		return this.listPackages.length;
		
	}
	public int getNumofTrucks() {
		return this.listTrucks.length;
	}

	//Creating Branch -1, branch name:HUB, packages: 0, trucks: 0

	public static int getBranchId() {
		return branchId;
	}
	public static void setBranchId(int branchId) {
		Branch.branchId = branchId;
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
