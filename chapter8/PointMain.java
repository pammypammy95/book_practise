// A program that deals with points. 
// Fourth version, to accompany encapsulated Point class. 
public class PointMain{ 

    public static void main(String[] args){ 
        
		// create two Point objects 
        Point p1 = new Point(7, 2);
        Point p2 = new Point(4, 3); 
		Point p3 = new Point(5, 5);

        // print each point and its distance from the origin 
        //System.out.println("p1 is " + p1); 

        //System.out.println("distance from origin = " + p1.distanceFromOrigin()); 
        //System.out.println("p2 is " + p2); 
        //System.out.println("distance from origin = " + p2.distanceFromOrigin()); 
		
		//p1 = p1.translate(11, 6);
		//p2 = p2.translate(1, 7);
		
        // print the points again. For translate() method
        //System.out.println("p1 translate is " + p1); 
        //System.out.println("p2 translate is " + p2); 
		
		// Manhattan distance
		//System.out.println("Manhattan distance between p1 and  p2 is " + p1.manhattanDistance(p2));
		
		// check if it is vertical
		//System.out.println("Is both Point vertical? " + p1.isVertical(p2));
		
		// return the slope
		//System.out.println("Slope between 2 Point is " + p1.slope(p2));
		
		// check if it is collinear
		//System.out.println("Is these Point collinear? " + p1.isCollinear(p2, p3));
	
    } 
}
