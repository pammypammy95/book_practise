public class Cd extends CollectionLibrary{
	
	private LocalTime t;
	
	// constructor
	public Cd(int id, String title, String author){
		
		super(id, title, author);
		
	}
	
	// length of CD
	public getCdLength(LocalTime t){
		
		this.t = t;
		
	}


	
}