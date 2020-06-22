// This program constructs a list of stop words and echoes
// Hamlet's famous speech with the stop words removed.
import java.util.*;
import java.io.*;

public class StopWords{
	
	public static void main(String[] args) throws FileNotFoundException{
	
		// build the list of stop words
		ArrayList<String> stopWords = new ArrayList<String>();
		
		stopWords.add("a");
		stopWords.add("be");
		stopWords.add("by");
		stopWords.add("how");
		stopWords.add("in");
		stopWords.add("is");
		stopWords.add("it");
		stopWords.add("of");
		stopWords.add("on");
		stopWords.add("or");
		stopWords.add("that");
		stopWords.add("the");
		stopWords.add("this");
		stopWords.add("to");
		stopWords.add("why");

		// process the file, printing all but stop words
		Scanner input = new Scanner(new File("speech.txt"));

		while (input.hasNext()){
			
			String next = input.next();
			
			if (!stopWords.contains(next.toLowerCase())){
				
				System.out.print(next + " ");
			}

		}

	}
	
}