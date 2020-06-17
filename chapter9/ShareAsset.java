// A ShareAsset represents a general asset that has a symbol and
// holds shares.
public abstract class ShareAsset implements Asset{
	
	private String symbol;
	private double totalCost;
	private double currentPrice;

	// constructs a new share asset with the given symbol
	// and current price
	public ShareAsset(String symbol, double currentPrice){
	
		this.symbol = symbol;
		this.currentPrice = currentPrice;
		totalCost = 0.0;
	
	}
	 
	// adds a cost of the given amount to this asset
	public void addCost(double cost){
		
		totalCost += cost;
	
	}

	// returns the price per share of this asset
	public double getCurrentPrice(){
	
		return currentPrice;
	
	}

	// returns the current market value of this asset
	public abstract double getMarketValue();

	// returns the profit earned on shares of this asset
	public double getProfit(){
		
		// calls an abstract getMarketValue method
		// (the subclass will provide its implementation)
		return getMarketValue() – totalCost;
	
	}

	// returns this asset's total cost for all shares
	public double getTotalCost(){
		
		return totalCost;
	
	}
	
	// sets the current share price of this asset
	public void setCurrentPrice(double currentPrice){
		
		this.currentPrice = currentPrice;
		
	}
	
}