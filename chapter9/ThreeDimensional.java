public abstract class ThreeDimensional implements ShapeThreeDimensional{
	
	private double volume;
	private double surfaceArea;
	
	// constructor
	public ThreeDimensional(){
		
		this.volume = 0.0;
		this.surfaceArea = 0.0;
		
	}
	
	// volume of shape
	public double getVolume(){
		
		return volume;
		
	};
	
	// surface area of shape
	public double getSurfaceArea(){
		
		return surfaceArea;
		
	};
	
	public String toString(){
		
		return "Surface area: " + surfaceArea + ". Volume: " + volume + ".";
		
	};
}