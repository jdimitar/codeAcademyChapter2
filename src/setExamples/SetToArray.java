package setExamples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetToArray {
	
	public static void main(String[] args) {
		HashSet<String> colorsSet = new HashSet<>();
		
		colorsSet.add("White");
		colorsSet.add("Black");
		colorsSet.add("Blue");
		colorsSet.add("Red");
		colorsSet.add("Brown");
		
		ArrayList<String> colorsList = new ArrayList<>();
		colorsList = set2array(colorsSet);
		
		System.out.println(colorsList);
		
		
		
		
		
		
		HashSet<Cars> carsSet = new HashSet<>();
		Cars opel = new Cars("Corsa", 2021, "Opel", "White", CarType.Hatchback);
		
		Cars vw = new Cars("T-rock", 2021, "VW", "Gray", CarType.SUV);
		
		carsSet.add(opel);
		carsSet.add(vw);
		
		ArrayList<Cars> carList = new ArrayList<>();
		carList = setToArrayCars(carsSet);
		System.out.println(carList);
		
		
	}
	
	public static ArrayList<String> set2array(HashSet<String> set){
		
		ArrayList<String> result = new ArrayList<>();
		
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			
			result.add(iterator.next());
		}
		
		return result;
	}
	
	
	public static ArrayList<Cars> setToArrayCars(HashSet<Cars> set){
		ArrayList<Cars> res = new ArrayList<>();
		Iterator<Cars> i = set.iterator();
		
		while (i.hasNext()) {
			res.add(i.next());
			
		}
		
		return res;
			
	}
	
	
	
	
	

}
