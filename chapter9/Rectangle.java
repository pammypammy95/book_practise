// Represents rectangular shapes.
public class Rectangle implements Shape{
	
	private double width;
	private double height;

	// constructs a new rectangle with the given dimensions
	public Rectangle(double width, double height){
	
		this.width = width;
		this.height = height;
	
	}

	// returns the area of this rectangle
	public double getArea(){
	
		return width * height;
	
	}

	// returns the perimeter of this rectangle
	public double getPerimeter(){
	
		return 2.0 * (width + height);
	
	}
	
	public boolean equals(Object obj){
		
		if(obj instance of Rectangle){
			
			Rectangle r = (Rectangle) obj;
			return (width == r.width && height == r.height);
			
		}
		
		return false;
	}
	
}