import java.util.Random;
public class MainOffice implements Node{
	private static int clock = 0;
	private Hub hub;
	private Package[] packages;
	
	public MainOffice(int branches, int trucksForBranch) {
		int i,j;
		for (i=0;i<branches;i++) {
			this.hub.branches[i+1]=new Branch();
			for (j=0;j<trucksForBranch;j++) {
				this.hub.listTrucks[j]=new StandardTruck();
			}
			
		}
		
	}
	public static int getClock() {
		return clock;
	}
	public static void setClock(int clock) {
		MainOffice.clock = clock;
	}
	public void play(int playTime) {
		int i;
		for (i=0;i<playTime;i++) {
			if (i == playTime - 1) {
				System.out.println("STOP");
			this.tick();
			}
		}
	}
	
	public String clockString() {

	}
	public void tick() {
		this.printClock();
		if (MainOffice.clock%5==0) {
			this.addPackage();
		}
		MainOffice.clock++;
		//work interface node IMPLEMENT!!
		


	}
	public void addPackage() {
		
		
		int SZip,SA,Dzip,DA,b,w,l,h;
		boolean bool;
		double weight;
		Random rand = new Random();
		//Package
		SZip=rand.nextInt();//CHECK THE NUMBER OF BRANCHES!!!!!!
		SA=rand.nextInt(900000)+100000;
		Dzip=rand.nextInt();
		DA=rand.nextInt(900000)+100000;
		Priority p = Priority.values()[new Random().nextInt(Priority.values().length)];
		Address Send = new Address(SZip,SA);
		Address Dest = new Address(Dzip,DA);
		//Small
		b=rand.nextInt(2);
		if (b==0) {bool=false;}
		else {bool=true;}
		//Standard
		weight=rand.nextDouble()+rand.nextInt(9)+1;
		//NonStandard
		w=rand.nextInt(300)+100;
		l=rand.nextInt(400)+100;
		h=rand.nextInt(900)+100;
		//Random a Package
		int choice=rand.nextInt(3)+1;
		if (choice==1) {
			Package smallp = new SmallPackage(p,Send,Dest,bool);
			this.packages[checkempty()]=smallp;
		}
		if (choice==2) {
			Package standardp = new StandardPackage(p,Send,Dest,weight);
			this.packages[checkempty()]=standardp;
}
		if (choice==3) {
			Package nonstandardp = new NonStandardPackage(p,Send,Dest,w,l,h);
			this.packages[checkempty()]=nonstandardp;
		}

	}
	public int checkempty() {
		int i=0;
		while (this.packages[i]!=null) {
			i++;
		}
		return i;
	}
	
	public void printClock() {
		int h,m;
		h=MainOffice.clock/60;
		m=(MainOffice.clock%60)*60;
		if (h<0) {
			if(m<0) 
				System.out.println("0"+h+":"+"0"+m);
			else 
				System.out.println("0"+h+":"+m);
		}
		else {
			if(m<0) 
				System.out.println(h+":"+"0"+m);
			else 
				System.out.println(h+":"+m);
		}

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
