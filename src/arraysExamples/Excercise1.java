package arraysExamples;

import java.util.Arrays;
import java.util.Iterator;

public class Excercise1 {

	public static void main(String[] args) {

		// Sortirajte gi nizite
		Integer celiBroevi[] = { 1789, 2035, 1899, 1456,9999, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456 };

		String tekst[] = { "Java", "Python", "C#", "C", "C++", "CA", "CB" };

		System.out.println(Arrays.toString(celiBroevi));

		Arrays.sort(celiBroevi);

		System.out.println(Arrays.toString(celiBroevi));

		System.out.println(Arrays.toString(tekst));

		Arrays.sort(tekst);

		System.out.println(Arrays.toString(tekst));

		// for home: dodadete metod za broenje na broevi pogolemi od 2000 i
		// deklarirajte ja dolzinata na nizata so nego
		
//		Integer arraySize = countNumbersLargerThan2K(celiBroevi);
		
		// Izdvoj gi vo posebna niza site broevi sho se pogolemi od 2000

		Integer pogolemiBroevi[] = new Integer[countNumbersLargerThan2K(celiBroevi)];
		int j = 0;
		for (int i = 0; i < celiBroevi.length; i++) {

			if ((celiBroevi[i]) >= 2000) {
				pogolemiBroevi[j] = celiBroevi[i];
				j++;
			}

		}

		System.out.println(Arrays.toString(pogolemiBroevi));

	}
	
	public static Integer countNumbersLargerThan2K(Integer niza[]) {
		
		Integer result=0;
		
		for(int i = 0; i < niza.length; i++) {
			if(niza[i]>2000) {
				result++;
			}
		}
		
		return result;
		
	}

}
