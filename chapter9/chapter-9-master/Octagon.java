public class Octagon implements Shape{
	
	private double sideLength;
	
	// constructor
	public Octagon(double sideLength){
		
		this.sideLength = sideLength;
		
	}
	
	// area of octagon
	public double getArea(){
		
		return 2 * (1 + Math.sqrt(2) * Math.pow(sideLength, 2));
		
	};
	
	// perimeter of octagon
	public double getPerimeter(){
		
		return 8 * sideLength;
		
	};
	
	// equals() method
	public boolean equals(Object obj){
		
		if(obj instance of Octagon){
			
			Octagon o = (Octagon) obj;
			return sideLength = o.sideLength;
		}
		
		return false;
	}
}