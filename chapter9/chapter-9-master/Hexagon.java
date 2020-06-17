public class Hexagon implements Shape{
	
		private double side;
	
		// constructor
		public Hexagon(){
			
			this.side = side;
			
		}
		
		// area of hexagon
		public double area(){
			
			return ((3 * Math.sqrt(3)) * 2) * Math.pow(side, 2);
			
		}
		
		public double perimeter(){
			
			return 6  * sides;
			
		}
		
		public boolean equals(Object obj){
			
			if(obj instance of Hexagon){
				
				Hexagon h = (Hexagon) obj;
				return this.side == h.side;
				
			}
			
			return false;
		}
	
}