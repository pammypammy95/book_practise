public class StudentAdvanceTicket extends Student{
	
	private static final int earlyPurchaseDay = 10;
	private int purchaseDay;
	private int ticketNumber;
	
	public StudentAdvanceTicket(int ticketNumber, int purchaseDay){
		
		this.ticketNumber = ticketNumber;
		this.purchaseDay = purchaseDay;
		
	}
	
	public double getPrice(){
		
		if(purchaseDay >= 10){
			
			return 15.0;
			
		}
		
		return 20.0;
	}
	
	public String toString(){
		
		return super.toString() + " (ID required)";
		
	}
	
}