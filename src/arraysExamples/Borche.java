package arraysExamples;

public class Borche {
	public static void main(String[] args) {

		Integer[] niza = { 53, 32, 19, 79, 25, 5, 47, 65, 31, 98, 107, };
		Integer min = niza[0];
		Integer max = niza[0];

		for (int i = 1; i < niza.length; i++) {
			if (niza[i] < min) {
				min = niza[i];
			}
			if (niza[i] > max) {
				max = niza[i];
			}
		}

		System.out.println("najmal e: " + min);
		System.out.println("najgolem e: " + max);
	}
}
