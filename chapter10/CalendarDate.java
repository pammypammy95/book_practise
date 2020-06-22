// The CalendarDate class stores information about a single
// calendar date (month and day but no year).
public class CalendarDate implements Comparable<CalendarDate>{
	
	private int month;
	private int day;
	private int year;

	public CalendarDate(int month, int day, int year){
	
		this.month = month;
		this.day = day;
		this.year = year;
	
	}

	// Compares this calendar date to another date.
	// Dates are compared by month and then by day.
	public int compareTo(CalendarDate other){
	
		if(year == other.year){
			
			if(month == other.month){
				
				return day - other.day;
				
			}
			
			return month - other.month;
		}
		
		return year - other.year;
	}

	public int getMonth(){
		
		return month;
	
	}

	public int getDay(){
		
		return day;
	
	}

	public int getYear(){
		
		return year;
		
	}

	public String toString(){
		
		return month + "/" + day;
	
	}
	
}
