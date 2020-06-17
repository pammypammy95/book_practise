public class DiscountBill extends GroceryBill{
	
	private boolean perferred;
	private double itemDiscountCount;
	private double itemDiscount;
	
	// constructor
	// whether customer should accept the discount
	public DiscountBill(Employee clerk, boolean perferred){
		
		super(clerk);
		this.perferred = perferred;
		this.itemDiscountCount = 0;
		this.itemDiscount = 0.0;
		
	}
	
	// adds item into list
	public void add(Item i){
		
		super.add(i);
		
		if(perferred && i.getDiscount() > 0){
			
			itemDiscountCount++;
			itemDiscount += i.getDiscount();
			
		}
		
	}
	
	// return total cost
	public double getTotal(){
		
		return super.getTotal() - discount;
		
	}
	
	// returns the number of items that were discounted
	public int getDiscountCount(){
		
		return itemDiscountCount;
		
	}
	
	// returns the total discount for this list
	public double getDiscountAmount(){
		
		return itemDiscount;
		
	}
	
	// returns the percent of the total discount
	// as what the total would be otherwise
	public double getDiscountPercent(){
		
		return (itemDiscount / super.getTotal()) * 100;
		
	}
	
}