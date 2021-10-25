package examples;

public class ExampleSobiranje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = 5;
		Integer b = 6;
		Integer c = 12;
		
		Integer rezultat=0;
		
		rezultat = sobiranje(a, b, c);
		System.out.println(rezultat);
		
		rezultat = odzemanje(c, b, a);
		System.out.println(rezultat);
		
	}
	
	public static Integer sobiranje(Integer x, Integer y, Integer z) {
		return x+y+z;
	}
	
	//c-b-a
	public static Integer odzemanje(Integer x, Integer y, Integer z) {
		return x-y-z;
	}
	
	
	
	

}
