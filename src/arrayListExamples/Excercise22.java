package arrayListExamples;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Excercise22 {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> lista1 = new ArrayList<>();
		
		lista1.add("Orange");
		lista1.add("Blue");
		lista1.add("Red");
		lista1.add("White");
		lista1.add("Black");
		lista1.add("Yellow");
		
		
		for (int i = 0; i < lista1.size(); i++) {
			
			
			System.out.println("Index: " + i + " Value: " + lista1.get(i));
			
		}
		
		
		Integer index = 0;
		for (String string : lista1) {
			
			System.out.println("Index: "+ index +" Value: " + string);
			index++;
			
		}
		
		
		
	
	}
	
	


}
