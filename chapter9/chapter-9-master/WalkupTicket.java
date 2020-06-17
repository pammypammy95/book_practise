public class WalkupTicket extends Ticket{
	
	private int ticketNumber;
	
	public WalkupTicket(int ticketNumber){
		
		this.ticketNumber = ticketNumber;
		
	}
	
	public double getPrice(){
		
		return 50.0;
		
	}
	
}