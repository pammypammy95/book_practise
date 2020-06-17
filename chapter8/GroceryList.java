public class GroceryList{
  
  private String[] gl;
  private int max = 10;
  private int count = 0;
  private double costTotal = 0.0;
  
  // constructor
  public GroceryList(){
    
   this.gl = new String[max];
    
  }
  
  // add item into list
  public void add(GroceryItemOrder list){
    
    if(gl.length >= 10){
      
      System.out.println("List is full.");
      
    }else{
      
      this.gl[count] = list;
      count++;
      
    }
    
  }
  
  // total sum of all items in the list
  public double getTotalCost(){
    
    for(int i = 0; i < count; i++){
      
      costTotal += g1[i].getCost();
      
    }
    
    return costTotal;
  }
  
}