package JavaTraining;

public class OopsConcepts {
	
	String name = "Jacky";
	String breed="Husky";
	int height=4;
	
	public void barking() {
		System.out.println(name + " is barking");
	}
	
	public void eating() {
		System.out.println(name + " is barking");
	}
	public static void main(String[] args) {
		OopsConcepts dog = new OopsConcepts();
		
		System.out.println(dog.name);
		
		dog.barking();
	}

}
