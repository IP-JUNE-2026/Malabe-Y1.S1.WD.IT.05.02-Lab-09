public class IT26102357Lab9Q3 {

   
    public static int add(int a, int b) {
        return a + b;
    }

 
    public static int multiply(int a, int b) {
        return a * b;
    }

    
    public static int square(int a) {
        return a * a; 
    }

    public static void main(String[] args) {
     
        int mult1 = multiply(3, 4);
        int mult2 = multiply(5, 7);
        int sum = add(mult1, mult2);
        int result1 = square(sum);

  
        int square1 = square(add(4, 7));
        int square2 = square(add(8, 3));
        int result2 = add(square1, square2);

   
        System.out.println("Result of (i) (3 * 4 + 5 * 7)^2 = " + result1);
        System.out.println("Result of (ii) (4 + 7)^2 + (8 + 3)^2 = " + result2);
    }
}