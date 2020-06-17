import java.math.BigDecimal;
import java.math.RoundingMode;

public class Line{
	
	private Point p1;
	private Point p2;
	
	// constructor with 2 x-coordinate, 2 y-coordinates
	public Line(int x1, int x2, int y1, int y2){
		
		p1 = new Point(x1, y1);
		p2 = new Point(x2, y2);
		
	}
	
	// constructor with 2 Point
	public Line(Point p1, Point p2){
		
		this.p1 = p1;
		this.p2 = p2;
		
	}
	
	// return Line's 1st endpoint
	public Point getP1(){
		
		return p1;
		
	}
	
	// return Line's 2nd endpoint
	public Point getP2(){
		
		return p2;
		
	}
	
	// String representation
	public String toString(){
		
		return "[(" + p1.getX() + ", " + p1.getY() + "), (" + p2.getX() + ", " + p2.getY() + ")]";
		
	}
	
	// get slope of this Line
	public double getSlope(){
		
		if(p1.getX() == p2.getX()){
			
			throw new IllegalArgumentException();
			
		}
		
		return (double) (p2.getY() - p1.getY()) / (double) (p2.getX() - p1.getX());
		
	}
	
	// determine 3 points are line up together
	public boolean isCollinear(Point p){
		
		// all x-coordinate are the same
		if(p1.getX() == p2.getX() && p2.getX() == p.getX()){
			
			return true;
			
		}
		
		// all y-coordinate are the same
		if(p1.getY() == p2.getY() && p2.getY() == p.getY()){
			
			return true;
			
		}
		
		double slope1 = getSlope();
		double slope2 = (double) (p2.getY() - p.getY()) / (double) (p2.getX() - p.getX());
		BigDecimal bd = new BigDecimal(slope1).setScale(4, RoundingMode.HALF_UP);
		slope1 = bd.doubleValue();
		bd = new BigDecimal(slope2).setScale(4, RoundingMode.HALF_UP);
		slope2 = bd.doubleValue();
		
		if(slope1 == slope2){
			
			return true;
			
		}
		
		return false;
	}
}