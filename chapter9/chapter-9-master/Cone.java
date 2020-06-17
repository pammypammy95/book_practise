import java.lang.Math;

public Cone extends ThreeDimensional implements ShapeThreeDimensioal{
	
	private double radius;
	private double height;
	
	// constructor
	Cone(double radius, double height){
		
		this.radius = radius;
		this.height = height;
		
	}
	
	// volume of shape
	public double getVolume(){
		
		return Math.PI * Math.pow(radius, 2) * (height / 3);
		
	};
	
	// surface area of shape
	public double getSurfaceArea(){
		
		return Math.PI * radius * (radius + (Math.sqrt((Math.pow(height, 2) + Math.pow(radius, 2)))));
		
	};
	
	// returns the radius
	public double getRadius(){
		
		return radius;
		
	}

	public String toString(){
		
		return super.toString() + "Square: Cone.";
		
	}

}