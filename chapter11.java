import java.util.*;
import java.io.*;

public class chapter11{

	// exe 1
	// Store only number 2 and all odd numbers from 3 upward
	// all remaining values are moved to prime list if first number == sqrt(maximum number)
	public static List<Integer> sieve(int max){
		
		List<Integer> prime = new LinkedList<Integer>();
		List<Integer> number = new LinkedList<Integer>();
		
		// add number 2 to max
		number.add(Integer.valueOf(2));
		
		for(int i = 3; i <= max; i = i + 2){
			
			number.add(i);
		
		}
		
		while(!number.isEmpty()){
		
			if(Math.sqrt(max) == number.get(0)){
				
				prime.addAll(number);
				number.clear();
			
			}else{
			
				// remove prime number from number list 
				int front = number.remove(0);
				prime.add(front);
				
				// remove multiplication of this prime number 
				Iterator<Integer> itr = number.iterator();
				
				while(itr.hasNext()){
					
					int current = itr.next();
					
					if(current % front == 0){
					
						itr.remove();
					
					}
				
				}
			
			}
		
		}
		
		return prime;
	}

	// exe 2 
	// returns a new List containing alternating elements from two list
	public static List<Integer> alternate(List<Integer> list1, List<Integer> list2){

		List<Integer> combined = new ArrayList<Integer>();
		Iterator itr1 = list1.iterator();
		Iterator itr2 = list2.iterator();

		while(itr1.hasNext() && itr2.hasNext()){

			int n1 = itr1.next();
			int n2 = itr2.next();
			combined.add(n1);
			combined.add(n2);

		}

		int excessIndex;

		// list1 contains larger element
		if(list1.size() > list2.size()){

			excessIndex = list1.size() - list2.size() - 1;
			combined.addAll(list1.subList(excessIndex, list1.size()));

			// list2 contains larger element
		}else{

			excessIndex = list2.size() - list1.size() - 1;
			combined.addAll(list2.subList(excessIndex, list2.size()));		


		}


		return combined;	
	}
	
	// exe 3
	// remove a specified value in a specified range of index
	public static List<Integer> removeInRange(List<Integer> list, int value, int start, int end){

		List subRange = list.subList(start, end);
		Iterator itr = subRange.iterator();

		while(itr.hasNext()){

			int num = itr.next();

			if(num == value){

				itr.remove();

			}

		}

		return list;
	}
	
	// exe 4
	// return a list 
	// element < e occurs before all elements that is > e
	public static List<Integer> partition(List<Integer> list, int e){

		LinkedList<Integer> more = new LinkedList<Integer>();
		Iterator<Integer> itr = list.iterator();

		while(itr.hasNext()){

			int num = itr.next();

			if(num > e){

				itr.remove();
				more.add(num);

			}

		}

		list.addAll(more);
		return list;
	}
	
	// exe 5
	// return a sorted list with no duplicates
	public static List<Integer> sortAndRemoveDuplicates(List<Integer> list){

		Set<Integer> sameList = new TreeSet<Integer>(list);
		list.clear();
		list.addAll(sameList);

		return list;

	}
	
	// exe 6
	// return the number of unique values in list
	public static int countUnique(List<Integer> list){

		Set<Integer> sameList = new HashSet<Integer>(list);

		int count = sameList.size();

		return count;
	}
	
	// exe 7
	// returns the number of same number occurs in both list
	public static int countCommon(List<Integer> list1, List<Integer> list2){

		Set<Integer> sList1 = new HashSet<Integer>(list1);
		Set<Integer> sList2 = new HashSet<Integer>(list2);
		Iterator<Integer> itr = sList1.iterator();
		int count = 0;

		// looping through list1 to find all matching element with list2
		while(itr.hasNext()){

			int num = itr.next();

			if(sList2.contains(num)){

				count++;

			}

		}

		return count;

	}
	
	// exe 8
	// return the length of the longest string in a set
	public static int maxLength(Set<String> list){

		Iterator<String> itr = list.iterator();
		int wordLength = 0;
		int max = 0;

		while(itr.hasNext()){

			wordLength = itr.next().length();
			max = Math.max(max, wordLength);

		}

		return max;

	}
	
	// exe 9
	// return true if the set contain odd number
	public static boolean hasOdd(Set<Integer> list){

		boolean containOdd = false;
		Iterator<Integer> itr = list.iterator();

		while(itr.hasNext()){

			int num = Math.abs(itr.next());

			if(num % 2 == 1){

				return true;

			}

		}

		return containOdd;
	}
	
	// exe 10
	// remove string from set that contain even length
	public static Set<String> removeEvenLength(Set<String> list){

		Iterator<String> itr = list.iterator();

		while(itr.hasNext()){

			int length = itr.next().length();

			if(length % 2 == 0){

				itr.remove();

			}

		}

		return list;
	
	}
	
	// exe 11
	// return the element contain the either 1 of the set, but not both
	public static Set<Integer> symmetricSetDifference(Set<Integer> list1, Set<Integer> list2){

		Set<Integer> uList = new HashSet<Integer>();
		uList.addAll(list1);
		uList.addAll(list2);

		// retain those appear in both list 
		list1.retainAll(list2);

		uList.removeAll(list1);

		return uList;
	}
	
	// exe 12
	// return true if the list contain the same String more than 3 and above
	public static boolean contain3(List<String> list){

		Map<String, Integer> map = new HashMap<String, Integer>();

		// adding word map.
		for(String word: list){

			String key = word.toLowerCase();

			// never seen the word before 
			if(!map.containsKey(key)){

				map.put(key, 1);

				// increment by 1 if exist 
			}else{

				int count = map.get(key);
				map.put(key, count + 1);

			}


		}

		// return true if contain more than 3
		for(String key: map.keySet()){

			int count = map.get(key);

			if(count > 3){

				return true;

			}

		}

		return false;
	}
	
	// exe 13
	// return true if multiple keys link to one same value 
	public static boolean isUnique(Map<String, String> map){

		List<String> list = new ArrayList<String>();

		for(String word : map.values()){

			list.add(word);

		}

		Iterator<String> itr = list.iterator();
		int count = 0;

		while(itr.hasNext()){

			String text = itr.next();
			count = Collections.frequency(list, text);

			// values belongs to multiple keys 
			if(count > 1){

				return true;

			}

		}

		return false;
	}
	
	// exe 14
	// return a map with union of 2 map 
	// same key, same value
	public static Map<String, Integer> intersect(Map<String, Integer> map1, Map<String, Integer> map2){

		Map<String, Integer> result = new HashMap<String, Integer>();
		Set<String> inter = map1.keySet();
		Iterator<String> itr = inter.iterator();

		while(itr.hasNext()){

			String key = itr.next();

			// key and vakue are same in 2 map
			if(map2.containsKey(key) && map2.get(key).equals(map1.get(key))){

				result.put(key, map1.get(key));

			}

		}

		return result;
	}
	
	// exe 15
	// return the maximum occurrence it happened 
	public static int maxOccurrences(List<Integer> list){

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for(int num : list){

			// count the number of time it occurs
			if(!map.containsKey(num)){

				map.put(num, 1);

			}else{

				int count = map.get(num);
				map.put(num, count + 1);

			}

		}

		int maxValue = Collections.max(map.values());

		return maxValue;
	}
	
	// exe 16
	// return true if 2 key linked to the same value
	public static boolean is1to1(Map<String, String> map){

		Set<String> set = map.keySet();
		Iterator<String> itr = set.iterator();
		System.out.println(map);
		while(itr.hasNext()){

			String word = itr.next();
			String value = map.get(word);
			itr.remove();

			// return true if duplicate value 
			if(map.containsValue(value)){

				return false;

			}

		}

		return true;

	}
	
	// exe 17
	// return true if it is a submap of another
	// same key and value
	public static boolean subMap(Map<String, String> map1, Map<String, String> map2){

		Set<String> set = map1.keySet();
		Iterator<String> itr = set.iterator();

		while(itr.hasNext()){

			String key = itr.next();

			if(map2.containsKey(key) && map2.get(key) == map1.get(key)){

				return true;

			}

		}

		return false;
	}
	
	// exe 18
	// reversing the map (key to value, value to key)
	// multiple key value, store as a set of string
	public static Map<String, Set<String>> reverse(Map<String, String> map){

		Map<String, Set<String>> reverseMap = new HashMap<String, Set<String>>();

		for(Map.Entry<String, String> entry : map.entrySet()){


			String oldValue = entry.getValue();
			String oldKey = entry.getKey();
			Set<String> newValue = null;

			if(reverseMap.containsKey(oldValue)){

				newValue = reverseMap.get(oldValue);
				newValue.add(oldKey);

			}else{

				newValue = new HashSet<>();
				newValue.add(oldKey);

			}

			reverseMap.put(oldValue, newValue);

		}

		return reverseMap;

	}
	
	// exe 19	
	// return the fewest occurrence of value
	// return the smallest value if it has equal occurrence 
	public static int rarest(Map<String, Integer> map){

		ArrayList<Integer> list = new ArrayList<Integer>(map.values());
		Map<Integer, Integer> rMap = new HashMap<Integer, Integer>();

		for(int num:list){

			if(!rMap.containsKey(num)){

				rMap.put(num, 1);

			}else{

				int count = rMap.get(num);
				rMap.put(num, count + 1);

			}

		}

		// minimum occurrences
		int minCount = Collections.min(rMap.values());
		// smallest number (values) it can contain by map range
		int minKey = Collections.max(rMap.keySet());

		// minimum occurrence value
		for(int num:rMap.keySet()){

			int key = rMap.get(num);

			if(minCount == key){

				minKey = Math.min(minKey, num);

			}

		}

		return minKey;
	}
	
	// exe 20
	// store in set rather than list
	// post: reads words from the Scanner, converts them to       
	// lowercase, returns a set of unique word in sorted order   
	public static Set<String> getWords(Scanner input){ 

		// ignore all but alphabetic characters and apostrophes 
		input.useDelimiter("[∧a-zA-Z']+"); 
		// read all words without duplicates
		Set<String> words = new HashSet<String>();

		while (input.hasNext()){ 

			String next = input.next().toLowerCase(); 
			words.add(next); 

		}        

		return words; 

	}

	// pre : set1 and set2 have no duplicates  
    // post: constructs and returns a set containing  
    //       the words in common between set1 and set2 
	public static Set<String> getOverlap(Set<String> set1, Set<String> set2){  

		Set<String> overlap = new HashSet<String>();
		overlap.addAll(set1);
		// overlap words in both set
		overlap.retainAll(set2);

		return overlap;

	}   
	
	
}
