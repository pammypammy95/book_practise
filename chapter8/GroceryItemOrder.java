public class GroceryItemOrder{
  
  private int qty;
  private double price;
  private String name;
  
  // constructor
  public GroceryItemOrder(String name, int quantity, double pricePerUnit){
    
    this.name = name;
    this.qty = quantity;
    this.price = pricePerUnit;
    
  } 
  
  // total cost per item
  public double getCost(){
    
    return qty * price;
    
  }
  
  // set quantity
  public void setQuantity(int quantity){
    
    this.qty = quantity;
    
  }
  
}