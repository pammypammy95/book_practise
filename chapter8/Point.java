// A Point object represents a pair of (x, y) coordinates.
// Fourth version: encapsulated.
import java.math.BigDecimal;
import java.math.RoundingMode;

 public class Point{  
 
	private int x;     
	private int y;   
 
	// constructs a new point at the origin, (0, 0) 
	public Point(){ 
	
		this(0, 0);  // calls Point(int, int) constructor  
 
	} 
 
	// constructs a new point with the given (x, y) location
	public Point(int x, int y){
     
		setLocation(x, y); 
	} 
	 
	// returns the distance between this Point and (0, 0)  
	public double distanceFromOrigin(){  
	 
		return Math.sqrt(x * x + y * y);
	 
	} 
	 
	// returns the x-coordinate of this point
	public int getX(){ 
	 
		return x;    
		
	 } 
	 
	// returns the y-coordinate of this point 
	public int getY(){ 
	 
		return y;   
		
	 } 
	 
	// sets this point's (x, y) location to the given values 
	public void setLocation(int x, int y){
		 
		this.x = x;  
		this.y = y;   
		
	 }  
	     
	// returns a String representation of this point 
	public String toString(){     
	 
		return "(" + x + ", " + y + ")";   
		
	 } 
	   
	// shifts this point's location by the given amount 
	public void translate(int dx, int dy){  
	 
		setLocation(x + dx, y + dy);  
		
	} 
	
	// Returns the distance from this point to the 
	// given other point. 
	public double distance(Point other){ 

		int dx = x - other.x; 
		int dy = y - other.y; 
		return Math.sqrt(dx * dx + dy * dy); 
	
	} 

	// Constructs a Point object with the same x and y 
	// coordinates as the given Point. 
	public Point(Point p){ 
		
		this.x = p.x; 
		this.y = p.y; 
		
	}

	// Sets this Point's x coordinate to the given value. 
	public void setX(int newX){ 
	
		x = newX; 

	}

	// Sets this Point's y coordinate to the given value. 
	public void setY(int newY){ 

		y = newY; 

	}
	
	// returns the manhattan distance
	public int manhattanDistance(Point other){
		
		return Math.abs(x - other.x) + Math.abs(y - other.y);
		
	}
	
	// given Point lines up vertically together
	public boolean isVertical(Point other){
		 
		if(x == other.x){
			
			return true;
			
		}
		 
		 return false;
	}
	
	// Determine the slope
	public double slope(Point other){
		
		if(x == other.x){
			
			throw new IllegalArgumentException();
			
		}
		
		return (double) (y - other.y) / (double) (x - other.x);
		
	}
	 
	// determine 3 points are line up together
	public boolean isCollinear(Point p1, Point p2){
		
		//when x is all the same
		if(x == p1.x && x == p2.x){
			
			return true;
			
		}
		
		//when y is all the same
		if(y == p1.y && y == p2.y){
			
			return true;
			
		}
		
		double slope1 = slope(p1);
		double slope2 = slope(p2);
		BigDecimal bd = new BigDecimal(slope1).setScale(4, RoundingMode.HALF_UP);
		slope1 = bd.doubleValue();
		bd = new BigDecimal(slope2).setScale(4, RoundingMode.HALF_UP);
		slope2 = bd.doubleValue();
		
		if(slope1 == slope2){
			
			return true;
			
		}
		
		return false;
	}
	
}
