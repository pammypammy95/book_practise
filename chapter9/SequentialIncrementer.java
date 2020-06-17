public class SequentialIncrementer implements Incrementable{
	
	private int value;
	
	// constructor
	public SequentialIncrementer(){
		
		this.value = 0;
		
	}
	
	// increment the value
	public void increment(){
		
		value++;
		return value;
		
	};
	
	// return the values
	public int getValue(){
		
		return value;
		
	}; 
	
}