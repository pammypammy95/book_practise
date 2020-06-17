public class Basketball extends SportGeneral{
	
	private int goalScored;
	private String teamName;
	private String position;
	
	// constructor
	public Basketball(String name, double salary, int number, int goalScored, String teamName, String position){
		
		super(name, salary, number);
		this.goalScored = goalScored;
		this.teamName = teamName;
		this.position = position;
		
	}
	
	// record scored point individually
	public int addScore(int score){
		
		goalScored += score;
		reutrn goalScored;
		
	}
	
}