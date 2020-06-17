public class Cube extends ThreeDimensional implements ShapeThreeDimensional{
	
	private double side;
	
	// constructor
	public Cube(double side){
		
		this.side = side;
		
	}
	
	// volume of shape
	public double getVolume(){
		
		return Math.pow(side, 3);
		
	};
	
	// surface area of shape
	public double getSurfaceArea(){
		
		return 6 * Math.pow(side, 2);
		
	};
	
	public string toString(){
		
		return super.toString() + "Shape: Cube."
		
	}
	
}