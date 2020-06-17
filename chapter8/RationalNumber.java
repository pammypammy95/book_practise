public class RationalNumber{
	
	private int numerator;
	private int denominator;
	
	// constructor
	public RationalNumber(int numerator, int denominator){
		
		if(denominator == 0){
			
			throw new IllegalArgumentException();
			
		}
		
		if(denominator < 0){
			
			this.denominator = 0 - (denominator);
			this.numerator =  -numerator;
			
		}
		
		this.numerator = numerator;
		this.denominator = denominator;
		
	}
	
	// constructor
	// setting num = 0, deno = 1
	public RationalNumber(){
		
		this.numerator = 0;
		this.denominator = 1;
		
	}

	// return denominator
	public int getDenominator(){
		
		return denominator;
		
	}
	
	// return numerator
	public int getNumerator(){
		
		return numerator;
		
	}
		
	// print Object
	public String toString(){
		
		if(denominator == 1){
			
			return numerator + "";
			
		}
		
		return numerator + "/" + denominator + "";
	}
	
	// add 2 rational number
	public RationalNumber add(RationalNumber num){
		
		int commonDeno = denominator * num.denominator;
		int totalNum = (numerator * num.denominator) + (denominator * num.numerator); 
		
		reducedForm(totalNum, commonDeno);
		
		return new RationalNumber(numerator, denominator);
	}
	
	// subtract parameter number from calling objects
	public RationalNumber subtract(RationalNumber num){
		
		int commonDeno = denominator * num.denominator;
		int totalNum = (numerator * num.denominator) - (denominator * num.numerator);
		
		reducedForm(totalNum, commonDeno);
		
		return new RationalNumber(numerator, denominator);
	}
	
	// multiple 2 rational number
	public RationalNumber multiple(RationalNumber num){
		
		int totalNum = numerator * num.numerator;
		int totalDeno = denominator * num.denominator;
		
		reducedForm(totalNum, totalDeno);
		
		return new RationalNumber(numerator, denominator);
	}
	
	// divide parameter from calling objects
	public RationalNumber divide(RationalNumber num){
		
		int totalNum = numerator * num.denominator;
		int totalDeno = denominator * num.numerator;
		
		reducedForm(totalNum, totalDeno);
		
		return new RationalNumber(numerator, denominator);
	}

	private void reducedForm(int num, int deno){
		
		if(num != 0){
			
			int common = gcd (Math.abs(num), deno);

			this.numerator = num / common;
			this.denominator = deno / common;
		}
		
	}
	
	private int gcd(int num1, int num2){
      
		while(num1 != num2){
			
			if(num1 > num2){
				
				num1 = num1 - num2;
				
			}else{
				
				num2 = num2 - num1;
				
			}

		}
		
		return num1;
	}
}