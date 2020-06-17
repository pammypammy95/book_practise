public class Rectangle{
	
	private int x;
	private int y;
	private int width;
	private int height;
	
	// constructor
	// x- and y- coordinate are top left corner
	public Rectangle(int x, int y, int width, int height){
	
		if(width < 0 || height < 0){
			
			throw new IllegalArgumentException();
			
		}
		
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		
	}
	
	// constructor
	// Point are top left corner
	public Rectangle(Point p, int width, int height){
		
		this.x = p.getX();
		this.y = p.getY();
		this.width = width;
		this.height = height;
		
	}
	
	// return height
	public int getHeight(){
		
		return height;
		
	}
	
	// return width;
	public int getWidth(){
		
		return width;
		
	}
	
	// return x-coordinate
	public int getX(){
		
		return x;
		
	}
	
	// return y-coordinate
	public int getY(){
		
		return y;
		
	}
	
	// print string
	public String toString(){
		
		return "Rectangle[x=" + x + ",y=" + y + ",width=" + width + ",height=" + height + "]";
		
	}
	
	// given Point lie inside the bound of rectangle
	public boolean contains(Point p){
		
		int xLimit = x + width;
		int yLimit = y - height;
		
		if((p.getX() >= x && p.getX() <= xLimit) && (p.getY() <= y && p.getY() >= yLimit)){
			
			return true;
			
		}
		
		return false;
	}
	
	// give coordinates lie inside the bound of rectangle
	public boolean contains(int x, int y){
		
		int xLimit = this.x + width;
		int yLimit = this.y - height;
		
		if((x >= this.x && x <= xLimit) && (y <= this.y && y >= yLimit)){
			
			return true;
			
		}
		
		return false;
		
	}
	
	// return bigger rectangle with 2 rectangle inside
	public Rectangle union(Rectangle rect){
		
		int topX = Math.min(this.x, rect.getX());
		int topY = Math.max(this.y, rect.getY());
		int bottomX = Math.max((this.x + width), (rect.getX() + rect.getWidth()));
		int bottomY = Math.min((this.y - height), (rect.getY() - rect.getHeight()));
		int width = bottomX - topX;
		int height = Math.abs(topY - bottomY);
		
		return new Rectangle(topX, topY, width, height);
	}
	
	// return the area of 2 rectangle coming together 
	public Rectangle intersection(Rectangle rect){
		
		int topX = Math.max(this.x, rect.getX());
		int topY = Math.min(this.y, rect.getY());
		int bottomX = Math.min((this.x + width), (rect.getX() + rect.getWidth()));
		int bottomY = Math.max((this.y - height), (rect.getY() - rect.getHeight()));
		int width = Math.max(0, (Math.abs(bottomX - topX)));
		int height = Math.max(0, (Math.abs(topY - bottomY)));
		
		return new Rectangle(topX, topY, width, height);
		
	}
}