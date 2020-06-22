public class chapter10{
	
	// exercise 1
	// returns the average number of 
	// vowel characters in all elements in the list
	public static double averageVowel(ArrayList<String> list){
		
		int countLetter = 0;
		int countVowel = 0;

		for(int i = 0; i < list.size(); i++){
			
			String word = list.get(i).toLowerCase();

			for(int j = 0; j < word.length(); j++){
				
				if(word.charAt(j) == 'a' || word.charAt(j) == 'e' || 
					word.charAt(j) == 'i' || word.charAt(j) == 'o' || word.charAt(j) == 'u'){
					
					countVowel++;
				
				}
				
				countLetter++;
			}
		
		}
		
		return (double) countVowel / (double) countLetter * 100.0;
	} 

	// exercise 2
	// switches the order of values in a pairwise fashion
	// length = odd: final element remain unchanged
	public static ArrayList<String> swapPairs(ArrayList<String> list){
	  
		String element;

		// if it is even size
		for(int i = 0; i < (list.size() / 2);i++){
			
			element = list.get(i);
			list.set(i, list.get(i + 1));
			list.set((i + 1), element);
		
		}
		
		return list;
	}

	// exercise 3
	// removes element of even length
	public static ArrayList<String> removeEvenLength(ArrayList<String> list){
		
		for(int i = list.size() - 1; i >= 0; i--){
			
			if(list.get(i).length() % 2 == 0){
			list.remove(i);
			
			}
		
		}
		
		return list;
	}

	// exercise 4
	// every element in the arraylist will be store twiced
	public static ArrayList<String> doubleList(ArrayList<String> list){
		
		for(int i = list.size() - 1; i >= 0; i--){
			
			String word = list.get(i);
			list.add((i + 1), word);
		
		}
		
		return list;
	}

	// exercise 5 
	// replce element with k copies of itself
	public static ArrayList<Integer> scaleByK(ArrayList<Integer> list){
		
		for(int i = list.size() - 1; i >= 0; i--){
			
			int count = list.get(i);
			
			// remove 0 and negative numbers
			if(count <= 0){
				
				list.remove(i);
			
			} 
			
			for(int j = 0; j <= (count - 1); j++){
				
				list.add((i + j), count);
			
			}
		
		}
		
		return list;
	}

	// exercise 6
	// moves the minimum to the front
	public static ArrayList<Integer> minToFront(ArrayList<Integer> list){
		
		int min = list.get(0);
		
		for(int n : list){
			
			min = Math.min(min, n);
		
		}
		
		list.remove(Integer.valueOf(min));
		list.add(0, min);
		return list;
	}

	// exercise 7
	// eliminate duplicates in the list
	// must sort the list using Collections package 
	// before passing it into parameter
	public static ArrayList<String> removeDuplicates(ArrayList<String> list){
		
		for(int i = 0; i < list.size(); i++){
			
			String word = list.get(i);
			int lastIndex = list.lastIndexOf(word);
			list.subList((i + 1), (lastIndex + 1)).clear();
		
		}
		
		return list;
	}

	// exercise 8
	// removes any element which is 0
	public static ArrayList<Integer> removeZeroes(ArrayList<Integer> list){
		
		for(int i = (list.size() - 1); i >= 0; i--){
			
			if(list.get(i) == 0){
				
				list.remove(i);
			
			}
		
		}
		
		return list;
	}

	// exercise 9
	// returns the number of indexes apart the 2 furthest 
	// occurrences of 0 
	public static int rangeBetweenZeros(ArrayList<Integer> list){
	  
		int first = list.indexOf(Integer.valueOf(0));
		int last = list.lastIndexOf(Integer.valueOf(0));

		// does not contain 0s
		if(first == -1 && last == -1){
			
			return 0;
		
		}
		
		return last - first + 1;
	}

	// exercise 10
	// removes element that fall alphabetically between the 
	// start and end Strings
	public static ArrayList<String> removeInRange(ArrayList<String> list, String start, String end){
		
		for(int i = list.size() - 1; i >= 0; i--){
			
			String word = list.get(i);
			
			if(word.compareTo(start) > 0 && word.compareTo(end) < 0){
				
				list.remove(i);
			
			}
		
		}
		
		return list;
	}

	// exercise 11
	// replace every element with 2 of that element
	public static ArrayList<String> stutter(ArrayList<String> list){
		
		for(int i = list.size() - 1; i >= 0; i--){
			
			String word = list.get(i);
			list.add((i + 1), word);
		
		}
		
		return list;
	}

	// exercise 12
	// add '****' in front of element with length of 4
	public static ArrayList<String> markLength4(ArrayList<String> list){
		
		for(int i = list.size() - 1; i >= 0; i--){
			
			String word = list.get(i);
			
			if(!word.equals("****")){
				
				if(word.length() == 4){
					
					list.add(i, "****");
				
				}
			
			}
		
		}
		
		return list;
	}

	// exercise 13
	// reverse each sequence of 3 values in the list
	// extra value will remain unchange
	public static ArrayList<Integer> reverse3(ArrayList<Integer> list){
		
		// number of group of 3's
		for(int i = 0; i < (list.size() / 3); i++){
			
			int n1 = list.get(i * 3);
			list.set(i * 3, list.get(i * 3 + 2));
			list.set(i * 3 + 2, n1);
		
		}
		
		return list;
	}

	// exercise 14
	// element in arraylist are compare in pairs
	// shorter string will be removed
	// remove first string if both length is same
	// extra value will remain unchange
	public static ArrayList<String> removeShorterStrings(ArrayList<String> list){
		
		for(int i = (list.size() / 2) - 1; i >= 0; i--){
			
			String w1 = list.get(i * 2);
			Sting w2 = list.get(i * 2 + 1);
			
			if(w1.length() > w2.length()){
				
				list.remove(i * 2 + 1);
			
			}else{
				
				list.remove(i * 2);
			
			}
		
		}
	  
		return list;
	}

	// exercise 15
	// replaces each pair of strings with a single string 
	// that contains 2 original string in parenthese separated by a comma
	// final value will remain unchange
	public static ArrayList<String> clump(ArrayList<String> list){
		
		for(int i = (list.size() / 2) - 1; i >= 0; i--){
		
			String word = "(" + list.get(i * 2) + ", " + list.get(i * 2 + 1) + ")";
			list.set(i * 2, word);
			list.remove(i * 2 + 1);
		
		}
		
		return list;
	}

	// exercise 16
	// combine 2 arraylist together
	// if a1 is long, extra value will be at the back of the arraylist
	public static ArrayList<Integer> interleave(ArrayList<Integer> a1, ArrayList<Integer> a2){
		
		if(a2.size() > a1.size()){
			
			for(int i = 0; i < a1.size(); i++){
				
				a1.add(i * 2 + 1, a2.get(i));
				
			}
			
			int arrayListLength = a1.size() - 1;
			
			// adding longer arraylist size to the back of the shorter arraylist
			for(int i = arrayListLength; i < a2.size(); i++){
				
				a1.add(a2.get(i));
				
			}
			
		}else{
			
			for(int i = 0; i < a2.size(); i++){
				
				a1.add(i * 2 + 1, a2.get(i));
				
			}
			
		}

		return a1;
	}

	// exercise 17
	// class must implement Comparable interface of Point type
	public int compareTo(Point other){
		
		if(y == other.y){
		
			return x - other.x;
		
		}
		
		return y - other.y;
	}

	// exercise 18
	// class must implement Comparable interface of TimeSpan type
	public int compareTo(TimeSpan other){
		
		if(hours == other.hours){
			
			return minutes - other.minutes;
		}
		
		return hours - other.hours;
		
	} 


	// exercise 19
	// class must implement Comparable interface of CalendarDate type
	public int compareTo(CalendarDate other){
	
		if(year == other.year){
			
			if(month == other.month){
				
				return day - other.day;
				
			}
			
			return month - other.month;
		}
		
		return year - other.year;
	}
}