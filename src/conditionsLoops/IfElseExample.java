package conditionsLoops;

public class IfElseExample {
	
	public static void main(String[] args) {
		
		Integer time=22;
		
		if (time<10) {
			System.out.println("Good morning");
		} else if (time<20) {
			System.out.println("Good day");
			
		} else if(time<00) {
			System.out.println("Good night");
		} else {
			System.out.println("Good evening");
		}
		
		
	}

}
