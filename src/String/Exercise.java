package String;

public class Exercise {
    public static String reverseWords(String input) {
    	if (input == null || input.trim().isEmpty()) {
    		return input;
    	}
    	
    	String[] words = input.split(" ");
    	StringBuilder reversed = new StringBuilder();
    	for(int i = words.length-1;i>=0;i--) {
    		reversed.append(words[i]);
    		if(i!=0) {
    			reversed.append(" ");
    		}
    	}
    	return reversed.toString();
    }
    public static void main(String args[]) {
    	String input = "Dog is dummy";
    	System.out.println(Exercise.reverseWords(input));
    }
}
    
