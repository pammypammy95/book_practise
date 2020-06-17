public class Name { 
	private String firstName; 
	private char middleInitial; 
	private String lastName;
	
	// Initializes a new Name with the given values. 
	public Name(String initialFirst, char initialMiddle, String initialLast){ 
		
		firstName = initialFirst; 
		middleInitial = initialMiddle; 
		lastName = initialLast; 
		
	}

	// Returns the person's first name. 
	public String getFirstName(){ 
		
		return firstName; 
		
	}
	
	// Returns the person's middle initial. 
	public char getMiddleInitial(){ 
	
		return middleInitial; 
		
	}

	// Returns the person's last name. 
	public String getLastName(){ 
		
		return lastName; 
	
	}

	// The name in normal order such as "John Q. Public". 
	public String getNormalOrder(){ 
		
		return firstName + " " + middleInitial + ". " + lastName; 
	
	}

	// The name in reverse order such as "Public, John Q.". 
	public String getReverseOrder(){ 
		
		return lastName + ", " + firstName + " " + middleInitial + "."; 
	
	}

	// Sets the first name to the given value. 
	public void setFirstName(String firstName){ 
	
		this.firstName = firstName; 
	
	}
	
	// Sets the last name to the given value. 
	public void setLastName(String lastName){ 
	
		this.lastName = lastName; 
	
	}
	
	// Sets the middle initial to the given value. 
	public void setMiddleInitial(char middleInitial){ 
	
		this.middleInitial = middleInitial; 
	
	} 

}