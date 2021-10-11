package arrayListExamples;

import java.util.ArrayList;

public class Excercise1 {
	
	//Write a Java program to create a new array list, add some colors (string) and print out the collection.  

	public static void main(String[] args) {
		
		ArrayList<String> colors = new ArrayList<>();
		
		colors.add("Red");
		colors.add("Green");
		colors.add("Orange");
		colors.add("White");
		colors.add("Black");
		
		colors.add(2, "Purple");
		
		
		System.out.println("Colors: " + colors);
		
		
	}
	
}
