import java.lang.Math;

public class Cylinder extends ThreeDimensional implements ShapeThreeDimensional{
	
	private double radius;
	private double height;
	
	public Cylinder(double radius, double height){
		
		this.radius = radius;
		this.height = height;
		
	}
	
	// volume of shape
	public double getVolume(){
		
		return Math.PI * Math.pow(radius, 2) * height;
		
	};
	
	// surface area of shape
	public double getSurfaceArea(){
		
		return (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2));
		
	};
	
	// return radius
	public double getRadius(){
		
		return radius;
		
	}
	
	public String toString(){
		
		return super.toString() + " Shape: Cylinder";
		
	}
	
}