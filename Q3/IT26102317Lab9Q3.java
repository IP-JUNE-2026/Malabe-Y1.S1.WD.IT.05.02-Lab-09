public class IT26102317Lab9Q3 {

    public static int calculateSum(int num1, int num2) {
        return num1 + num2;
    }

    public static int calculateProduct(int num1, int num2) {
        return num1 * num2;
    }

    public static int findSquare(int value) {
        return value * value;
    }

    public static void main(String[] args) {
        int firstProduct = calculateProduct(3, 4);
        int secondProduct = calculateProduct(5, 7);
        int totalSum = calculateSum(firstProduct, secondProduct);
        int answer1 = findSquare(totalSum);

        int firstGroupSum = calculateSum(4, 7);
        int firstGroupSquare = findSquare(firstGroupSum);
        int secondGroupSum = calculateSum(8, 3);
        int secondGroupSquare = findSquare(secondGroupSum);
        int answer2 = calculateSum(firstGroupSquare, secondGroupSquare);

        System.out.println("Result 1: " + answer1);
        System.out.println("Result 2: " + answer2);
    }
}