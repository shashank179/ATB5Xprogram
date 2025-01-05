package Programs;

public class PassArrayToMethod {
	
	public static void findMin(int arrayone[]) {
		int min = arrayone[0];
		
		for(int i=0; i<arrayone.length;i++) {
			if(min>arrayone[i]) {
				min=arrayone[i];
			}
		}
		System.out.println("Minimum value is : " + min);
	}
	
	public static int[] arraythree() {
		
		return new int[] {1,2,3,4,5,6};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arrayTest[] = {12,11,14,15,18};
		
		PassArrayToMethod.findMin(arrayTest);
		
		int arraythee[]= PassArrayToMethod.arraythree();
		
		System.out.println(arraythee[2 ]);
	}

}
