public class Sphere extends ThreeDimensional implements ShapeThreeDimensional{
	
	private double radius;
	
	public Sphere(double radius){
		
		this.radius = radius;
		
	}
	
	// volume of shape
	public double getVolume(){
		
		return (4 / 3) * Math.PI * radius;
		
	};
	
	// surface area of shape
	public double getSurfaceArea(){
		
		return (4 / 3) * Math.PI * Math.pow(radius, 3);
		
	};
	
	public double getRadius(){
		
		return radius;
		
	}
	
	public String toString(){
		
		return super.toString() + "Shape: Sphere.";
		
	}
	
}