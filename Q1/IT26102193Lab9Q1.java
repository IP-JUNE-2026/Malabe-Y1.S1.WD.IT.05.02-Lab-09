import java.util.Scanner;

public class IT26102193Lab9Q1 {
    public static void main(String[] args) {
		
		double root1, root2;
		
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value a: ");
        double a = input.nextDouble();
        System.out.print("Enter value b: ");
        double b = input.nextDouble();
        System.out.print("Enter value c: ");
        double c = input.nextDouble();

        double discriminant = Math.pow(b, 2) - (4 * a * c);

        System.out.println();

        if (discriminant > 0) {
           
            System.out.println("Roots are real and different :");
            
        } else if (discriminant == 0) {
			
            System.out.println("Roots are real and equal :");
            
        } else {
            
            System.out.println("Roots are complex and different :");
			return;
			
		}
			
			  root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
              root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            
			System.out.println("Root 1 : " + String.format("%.2f" , root1));
            System.out.printf("Root 2 : " + String.format("%.2f" , root2));
        
	}

        
    }
