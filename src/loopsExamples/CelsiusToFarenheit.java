package loopsExamples;

import java.util.Iterator;

public class CelsiusToFarenheit {
//	F = 9/5 * Celsius + 32

	
	public static void main(String[] args) {
		
		System.out.println( celsiusToFarenheit(40));
		
		//
		starLeft('d');
		
		
		
	}
	
	public static Double celsiusToFarenheit(Integer celsius) {
		
		Double f ;
		
		f = (double) ((celsius * 9/5) + 32);
		
		return f;
		
	}
	
	
	
	public static void starLeft(char c) {
		
		for (int i = 1; i <= 6; i++) {
			
			for (int j = 1; j < i; j++) {
				System.out.print(c);
			}
			System.out.println();
			
		}
	}
	
}
