package String;

public class Stringintro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Shashank Rao";
		String name1 ="Shashank Rao";
		
		String country = new String("India");
		String country1 = new String("india");
		
		/*
		 * System.out.println(name);
		 * 
		 * System.out.println(country);
		 * 
		 * System.out.println(name.equals(name1));
		 * System.out.println(name.equalsIgnoreCase(name1));
		 * 
		 * System.out.println(country.equals(country1));
		 * System.out.println(country.equalsIgnoreCase(country1));
		 * 
		 * System.out.println(name == name1); System.out.println(country == country1);
		 */
		
		System.out.println(name + name1);
		System.out.println(name.concat(name1));
	}

}
