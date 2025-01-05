package String;

public class Stringmethod1 {
	public static void main(String args[]) {
		String text ="Learning in the key";
		
		for(int i=0;i<text.length();i++) {
			System.out.print(text.charAt(i));
		}
		System.out.println(" ");
		
		String textx= text.concat(" to Success");
		System.out.println(textx);
		
		System.out.println(text.contains("key"));
		
		System.out.println(text.endsWith("key"));
	}
}
