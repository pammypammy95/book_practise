public class Ticket{
	
	private int ticketNumber;
	private double ticketPrice;
	
	public Ticket(int ticketNumber){
		
		this.ticketNumber = ticketNumber;
		
	}
	
	public double getPrice(){
		
		return ticketPrice;
		
	}
	
	public String toString(){
		
		return "Number: " + ticketNumber + ", Price: " + ticketPrice;
		
	}
	
}