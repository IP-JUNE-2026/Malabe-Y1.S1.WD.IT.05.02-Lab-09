import java.util.Scanner;

public class IT26102355Lab9Q1{
	
	public static void main(String[] args) {
		
		 double a,b,c;
		 
		 Scanner input = new Scanner(System.in);
		 
		 System.out.print("Enter value a : ");
		 a = input.nextDouble();
		 
		  System.out.print("Enter value b : ");
		 b = input.nextDouble();
		 
		  System.out.print("Enter value c : ");
		 c = input.nextDouble();
		 
		 double delta = Math.pow(b,2) - (4*a*c);
		 
		 if (delta > 0){
			 System.out.println("Roots are real and different");
			 double root1 = (-b + Math.sqrt(delta))/(2*a);
			 double root2 = (-b - Math.sqrt(delta))/(2*a);
			 
			 System.out.println("Root 1 : " +root1);
			 System.out.print("Root 2 : " +root2);
		 }
		 else if (delta == 0){
			 System.out.println("Roots are real and equal");
			 double root3 = -b / (2*a);
			 System.out.print("Root 3: " +root3);
		 }
		 else{
			 System.out.print("Roots are complex and imaginary");
		 }
		 
		 
		 
	}
}
