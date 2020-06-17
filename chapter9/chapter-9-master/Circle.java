// Represents circular shapes.
public class Circle implements Shape{
	private double radius;

	// constructs a new circle with the given radius
	public Circle(double radius){
	
		this.radius = radius;
	
	}

	// returns the area of this circle
	public double getArea(){
	
		return Math.PI * radius * radius;
	
	}

	// returns the perimeter of this circle
	public double getPerimeter(){
	
		return 2.0 * Math.PI * radius;
	
	}
	
	public boolean equals(Object obj){
		
		if(obj instance of Circle){
			
			Circle c = (Circle) obj;
			return radius = c.radius;
			
		}
		
		return false;
	}
}