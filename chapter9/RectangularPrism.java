public class RectangularPrism extends ThreeDimensional implements ShapeThreeDimensional{
	
	private double width;
	private double height;
	private double length;
	
	public RectangularPrism(double length, double height, double width){
		
		this.length = length;
		this.height = height;
		this.width = width;
		
	}
	
	// volume of shape
	public double getVolume(){
		
		return width * height * length;
		
	};
	
	// surface area of shape
	public double getSurfaceArea(){
		
		return 2 * ((width * length) + (height * lenght) + (height * width));
		
	};
	
	public String toString(){
		
		return super.toString() + "Shape: Rectangular Prism";
		
	}
	
}