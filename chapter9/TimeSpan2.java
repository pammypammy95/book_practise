//Represents a time span of elapsed hours and minutes. 
// Second implementation using a single field for total minutes. 
// Class invariant: totalMinutes >= 0 
 
public class TimeSpan2 { 

	private int totalMinutes; 
 
    // Constructs a time span with the given interval. 
    // pre: hours >= 0 && minutes >= 0 
    public TimeSpan(int hours, int minutes){ 
       
		totalMinutes = 0; 
        add(hours, minutes); 
		
    } 
 
    // Adds the given interval to this time span. 
    // pre: hours >= 0 && minutes >= 0 
    public void add(int hours, int minutes){ 
        
		if (hours < 0 || minutes < 0){ 
		
            throw new IllegalArgumentException(); 
			
        } 
		
        totalMinutes += 60 * hours + minutes; 
    } 
 
    // returns a String for this time span, such as "6h 15m" 
    public String toString(){ 
	
        return (totalMinutes / 60) + "h " + (totalMinutes % 60) + "m"; 
		
    } 
	
	// add timespan to method with object parameter
	public void add(Timespan span){
		
		totalMinutes += span.totalMinutes;
		
	}
	
	// subtract timespan 
	public void subtract(Timespan span){
		
		totalMinutes -= span.totalMinutes;
		
	}

	// time x factor
	public void scale(int factor){
		
		totalMinutes *= factor;
		
	}

	// equals when hours and minutes are same
	public boolean equals(Object obj){
		
		if(obj instance of Timespan){
			
			Timespan ts = (Timespan) obj;
			
			return totalMinutes == ts.totalMinutes;
			
		}
		
		return false;
	}
}
