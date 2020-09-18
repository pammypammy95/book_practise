public class chapter12{
	
	// exe1
	// prints asterisks of 2 to the power of n 
	public static String startString(int num){

		if(num < 0){

			throw new IllegalArgumentException();

		}else if(num == 0){

			return "*";

		}else{

			return startString(num - 1) + startString(num - 1);

		}

	}
	
	
	
	
}
