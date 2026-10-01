import java.util.Scanner;

public class IT26102317Lab9Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value c: ");
        double c = sc.nextDouble();

        double root1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        double root2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);

        System.out.println("Roots are real and different:");
        System.out.printf("Root 1: %.2f\n", root1);
        System.out.printf("Root 2: %.2f\n", root2);

        sc.close();
    }
}