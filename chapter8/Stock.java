// A Stock object represents purchases of shares of a stock. 
public class Stock{
	
    private String symbol;     // stock symbol, e.g. "YHOO"     
	private int totalShares;     // total shares purchased      
	private double totalCost;    // total cost for all shares      
	 
	// initializes a new Stock with no shares purchased 
    // pre: symbol != null
	public Stock(String theSymbol){

		if(theSymbol == null){ 
	
			throw new NullPointerException();
		
		} 
	
		symbol = theSymbol;         
		totalShares = 0;         
		totalCost = 0.0;     
	}      
	
	// returns the total profit or loss earned on this stock, 
	// based on the given price per share      
	// pre: currentPrice >= 0.0 
	public double getProfit(double currentPrice){ 

		if(currentPrice < 0.0){             
		
			throw new IllegalArgumentException();         
		
		}        
		
		double marketValue = totalShares * currentPrice; 
        return marketValue – totalCost; 

	}      
	
	// records purchase of the given shares at the given price 
	// pre: shares >= 0 && pricePerShare >= 0.0 
	public void purchase(int shares, double pricePerShare){
		
        if(shares < 0 || pricePerShare < 0.0){

			throw new IllegalArgumentException(); 
			
        } 
		
        totalShares += shares;        
		totalCost += shares * pricePerShare; 
		
	}  
	
	// Returns this Stock's symbol value. 
	public String getSymbol(){ 
	 
		return symbol; 
	 
	 }
	
	// Returns this Stock's total number of shares purchased. 
	public int getTotalShares(){ 
	
		return totalShares; 
	
	}
	
	// Returns this Stock's total cost for all shares. 
	public double getTotalCost(){ 
	
		return totalCost; 
	
	}
	
	// reset the variables to 0
	public void clear(){
		
		this.totalShare = 0;
		this.totalCost = 0;
		
	}


}