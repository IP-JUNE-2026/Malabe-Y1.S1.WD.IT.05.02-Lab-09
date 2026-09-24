public class IT26102193Lab9Q3 {

    
    public static int add(int x, int y) {
        return x + y;
    }

    
    public static int multiply(int x, int y) {
        return x * y;
    }

   
    public static int square(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        
        int part1 = add(multiply(3, 4), multiply(5, 7));
        int result1 = square(part1);
        System.out.println("Result of (3 * 4 + 5 * 7)\u00B2\t: " + result1);

        
        int result2 = add(square(add(4, 7)), square(add(8, 3)));
        System.out.println("Result of (4 + 7)\u00B2 + (8 + 3)\u00B2\t: " + result2);
    }
}