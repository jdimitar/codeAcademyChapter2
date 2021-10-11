package arrayListExamples;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Excercise16 {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> lista1 = new ArrayList<>();
		ArrayList<String> result = new ArrayList<>();
		
		lista1.add("Orange");
		lista1.add("Blue");
		lista1.add("Red");
		lista1.add("White");
		lista1.add("Black");
		
		result = (ArrayList<String>) lista1.clone();
		
		lista1.add("Yellow");
		
		
		lista1.remove(lista1.indexOf("Black"));
		
		lista1.trimToSize();
		
		lista1.add("Black");
		
		lista1.trimToSize();
		
		System.out.println("Result: " + result);
		//Excercise 17
//		lista1.removeAll(lista1);
		
		//Excercise 20
		lista1.ensureCapacity(9);
		
	
	}
	
	


}
