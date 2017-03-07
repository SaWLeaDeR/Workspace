
public class ReverseInput {
	public static void main(String[] args){
		String reverse = reverseWords(0, args);
		System.out.println(reverse);

	}


	public static String reverseWords(int startIndex, String[] words){

		try{
		if (startIndex == words.length-1){
			return words[startIndex];
		}
			
		}catch (StackOverflowError e){
			System.out.println("it is not working");
		}
		return reverseWords(startIndex + 1 ,words) + " " + words[startIndex];

	}
}
