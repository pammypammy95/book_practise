import java.util.Random;

public class RandomIncrementer implements Incrementable{
	
	private int value;
	
	public class RandomIncrementer(){
		
		this.value = randomInt();
		
	}
	
	// increment the value
	public void increment(){
		
		this.value = randomInt();
		
	};
	
	// return the values
	public int getValue(){
		
		return value;
		
	};
	
	private int randomInt(){
		
		Random r = new Random();
		return r.nextInt(10) + 1;
		
	}
	
}