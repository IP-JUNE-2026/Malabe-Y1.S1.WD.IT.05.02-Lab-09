import java.util.Scanner;

public class IT26102355Lab9Q2{
	
	public static double circleArea(double radius){
		return Math.PI*(Math.pow(radius,2));
	}
	
	public static void main(String[] args) {
		
		double radius,area;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the radius : ");
		radius = input.nextDouble();
		
		area = circleArea(radius);
		System.out.print("Enter the area  : " +area);
		
	}

}