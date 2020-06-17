public class LineMain{
	
	public static void main(String []args){
		
		// create two Point objects 
        Point p1 = new Point(2, 2);
        Point p2 = new Point(2, 2); 
		Point p3 = new Point(4, 4);
		
		// create line objects
		Line line1 = new Line(p1, p2);

		// print Line1
		//System.out.println("Line 1 is " + line1);
		
		// return the slope
		System.out.println("Slope of the line is" + line1.getSlope());

		// check if it is collinear
		System.out.println("Is it collinear? " + line1.isCollinear(p3));
		
	}
	
}