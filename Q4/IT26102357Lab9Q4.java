import java.util.Scanner;

public class IT26102357Lab9Q4 {

   
    public static double calcFinalMark(double assignmentMark, double examMark) {
        return (assignmentMark * 0.30) + (examMark * 0.70);
    }


    public static char findGrades(double finalMark) {
        if (finalMark >= 75) {
            return 'A';
        } else if (finalMark >= 65) {
            return 'B';
        } else if (finalMark >= 50) {
            return 'C';
        } else if (finalMark >= 40) {
            return 'S';
        } else {
            return 'F';
        }
    }

    public static void printDetails(String name, double finalMark, char grade) {
        System.out.println("----------------------------------------");
        System.out.println("Student Name : " + name);
        System.out.println("Final Mark   : " + finalMark);
        System.out.println("Grade        : " + grade);
        System.out.println("----------------------------------------");
    }

 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        for (int i = 1; i <= 5; i++) {
            System.out.println("\nEnter details for Student " + i + ":");
            
            System.out.print("Enter Name: ");
            String name = scanner.next();

            System.out.print("Enter Assignment Mark (out of 100): ");
            double assignmentMark = scanner.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100): ");
            double examMark = scanner.nextDouble();

          
            double finalMark = calcFinalMark(assignmentMark, examMark);
            char grade = findGrades(finalMark);

            printDetails(name, finalMark, grade);
        }

       
    }
}