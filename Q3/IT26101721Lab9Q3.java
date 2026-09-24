public class IT26101721Lab9Q3 {

    // Add two integrers
	public static int add(int a, intb) {
	    return a + b;
	}
	
	// Multiply two intergres
	public static int multiply(int a, int b) {
	    return a * b;
	}
	
	// squre an interger
	public static int squre(int number) {
	    return number * number;
	}
	
	public static void main(String[] args) {
	
	    // (3 * 4 + 5 * 7)^2
		int result1 = squre(add(multiply(3, 4), multiply(5, 7)));
		
		// (4 + 7)^2 + (8 + 3)^2
		int result2 = add(squre(add(4, 7)), squre(add(8, 3)));
		
		System.out.println("Result of (3 * 4 + 5 * 7)^2");
		System.out.println(result1);
		
		System.out.println("Result of (4 + 7)^2 + (8 + 3)^2");
		System.out.println(result2);
		
	}
	
}