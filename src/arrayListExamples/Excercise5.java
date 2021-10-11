package arrayListExamples;

import java.util.ArrayList;

public class Excercise5 {
	
	//Update value of predefined position

	public static void main(String[] args) {

		ArrayList<String> colors = new ArrayList<>();

		colors.add("White");
		colors.add("Black");
		colors.add("Red");
		colors.add("Orange");

		System.out.println("Original array: " + colors);

		colors.set(2, "Yellow");

		System.out.println("Modified array: " + colors);

	}

}
