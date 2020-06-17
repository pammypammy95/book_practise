public class AdvanceTicket extends Ticket{
	
	private static final int earlyPurchaseDay = 10;
	private int purchaseDay;
	private int ticketNumber;
	
	public AdvanceTicket(int ticketNumber, int purchaseDay){
		
		this.ticketNumber = ticketNumber;
		this.purchaseDay = purchaseDay;
		
	}
	
	public double getPrice(){
		
		if(purchaseDay >= 10){
			
			return 30.0;
			
		}
		
		return 40.0;
		
	}
	
}