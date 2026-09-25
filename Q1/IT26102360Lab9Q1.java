import java.util.Scanner;
public class IT26102360Lab9Q1 {

    public static void main(String[] args) {

        double A,B,C;
        double x,y,root1=0,root2=0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Value a: ");
        A = input.nextDouble();

        System.out.print("Enter Value b: ");
        B = input.nextDouble();

        System.out.print("Enter Value c: ");
        C = input.nextDouble();

        y = (Math.pow(B,2) - 4*A*C);



        if (y > 0) {
            
			root1 = (-B + Math.sqrt(y)) / (2 * A);
            root2 = (-B - Math.sqrt(y)) / (2 * A);
			
			
        } 
		else {
            System.out.print("Root are complex and imaginary");

        }

        System.out.println("Root 1: " + root1);
        System.out.println("Root 2: " + root2);









    }
}



