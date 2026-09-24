import java.util.Scanner;

public class IT26101721Lab9Q4 {

    // Calculater the final mark
	public static double calculaterMark(double assignmentMark, double exammark) {
	    return (assignmentMark * 0.30) + (examMark * 0.70);
	}
	
	// Find the grade
	public static char findGrades(double findMark) {
	
	    if (finalMark >= 75) {
		    return 'A';
		} else if (finalMark >= 60) {
		    return 'B';
		} else if (finalMark >= 50) {
		    return 'C';
		} else {
		    return 'F';
		}
	}  
	
	// Print student details
	public static void printDetails(String name, double finalMark, char grade) {
	    System.out.println("Name: " + name);
		System.out.println("Final Mark: %.2f%n", finalMark);
		System.out.println("Grade: " + grade);
		System.out.println();
		
	}
	
	public static void main(String[] args) {
	 
	    Scanner input = new Scanner(System.in);
		
		for (int i = 1; i <= 5; i++) {
		
		    System.out.println("Enter details of student " + i);
			
			System.out.print("Enter Name: ");
			String name = input.nextLine();
			
			System.out.print("Enter assignment Mark: ");
			double assignmentMark = input.nextDouble();
			
			System.out.print("Enter exam paper Mark: ");
			double examMark = input.nextDouble();
			
			input.nextLine();
			
			double finalMark = calcFinalMark(assignmentMark, examMark);
			
			char grade = findGrades(findMark);
			
			printDetails(name, finalMark, grade);
			
		}
		
		input.close();
		
	}
	
}
	