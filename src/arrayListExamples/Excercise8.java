package arrayListExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Excercise8 {

	public static void main(String[] args) {

		ArrayList<String> colors = new ArrayList<>();

		colors.add("White");
		colors.add("Black");
		colors.add("Red");
		colors.add("Orange");
		
		System.out.println("Original array: " + colors);
		
		Collections.sort(colors);
		
		System.out.println("Sorted array: " + colors);
		
		//Sort descending (reveresed array)
		
		Collections.reverse(colors);
		
		System.out.println("Reversed array: " + colors);

	}
}
