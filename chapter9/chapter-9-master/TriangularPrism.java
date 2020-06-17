public class TriangularPrism extends ThreeDimensional implements ShapeThreeDimensional{
	
	private double height;
	private double side1;	// a
	private double side2;	// b
	private double side3;	// c
	
	// consturctor
	public class TriangularPrism(double height, double side1, double side2, double side3){
			
		this.height = height;
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		
	}

	// volume of shape
	public double getVolume(){
		
		return (1 / 4) * height * (Math.sqrt(-(Math.pow(side1, 4))) + (2 * Math.pow((side1 * side2), 2)) + 
				(2 * (Math.pow((side1 * side3), 2))) - (Math.pow(side2, 4)) + (2 * (Math.pow((side2 * side3), 2)))
				- Math.pow(side3, 4));
		
	};
	
	// surface area of shape
	public double getSurfaceArea(){
		
		double s = (side1 + side2 + side2) / 2;
		double tri = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		
		return 2 * tri + (side1 + side2 + side3) * h;
		
	};
	
	public String toString(){
		
		reutrn super.toString() + "Shape: Triangular Prism.";
		
	}
	
}