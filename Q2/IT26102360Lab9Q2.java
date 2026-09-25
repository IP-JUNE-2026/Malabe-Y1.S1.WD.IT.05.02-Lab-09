import java.util.Scanner;
public class IT26102360Lab9Q2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double radius,area;

        System.out.print("Enter the radius of  the circle: ");
        radius = input.nextDouble();

        area = circleArea(radius);
        System.out.print("The area of the circle with radius " + radius + " is : " + area);



    }


    public static double circleArea(double radius){

        final double PI = 3.14;
        double area;

        area = PI * Math.pow(radius,2);

        return area;



    }

}