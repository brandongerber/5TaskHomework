public class SentenceReverser {
	public static void main(String[] args) {
		// Name in normal format
		String sentence = "Brandon Gerber";
		//string builder to reverse characters
		String reversedSentence = new StringBuilder (sentence).reverse().toString();
		// printing input and output 
		System.out.println ("My name is " + sentence);
		System.out.println ("My name reversed is " + reversedSentence);
		
	}
}
