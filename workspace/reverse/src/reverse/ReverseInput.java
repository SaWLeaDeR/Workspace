package reverse;


public class ReverseInput{

	public static void main(String[] args){
		String reverse = reverseWords(0, args);
		System.out.println(reverse);

	}


	public static String reverseWords(int startIndex, String[] words){

		if (startIndex == words.length-1){
			return words[startIndex];
		}else{
			return reverseWords(startIndex + 1 ,words) + " " + words[startIndex];
		}

	}
}