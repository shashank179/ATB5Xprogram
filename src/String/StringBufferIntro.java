package String;

public class StringBufferIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name ="Shashank";
		
		name.concat("Rao");
		
		System.out.println(name);
		
		StringBuffer name1 = new StringBuffer("Shashank");
		//name1.append("Rao");
		
		//name1.insert(0, "Rao");
		//name1.replace(0, 3, "Rao");
		
		name1.delete(1, 3);
		name1.reverse();
		System.out.println(name1);
		
	}

}
