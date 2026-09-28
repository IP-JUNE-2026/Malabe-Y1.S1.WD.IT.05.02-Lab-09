import java.util.Scanner;

public class IT26102368Lab9Q4 {

    public static double calcFinalMark(double assignment, double exam) {
       
	   double finalMark;

        finalMark = (assignment * 30 / 100) + (exam * 70 / 100);

        return finalMark;
    }

     public static char findGrades(double finalMark) {
        if (finalMark >= 75) {
            return 'A';
        } 
        else if (finalMark >= 60) {
            return 'B';
        } 
        else if (finalMark >= 50) {
            return 'C';
        } 
        else {
            return 'F';
        }
    }


    public static void printDetails(String name, double finalMark, char grade) {
        System.out.println(name + "\t" + finalMark + "\t" + grade);
    }

   
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Name\tFinal Mark\tGrade");

        for (int i = 1; i <= 5; i++) {

            System.out.println("\nStudent " + i);

            System.out.print("Enter Name: ");
            String name = input.next();

            System.out.print("Enter Assignment Mark: ");
            double assignment = input.nextDouble();

            System.out.print("Enter Exam Mark: ");
            double exam = input.nextDouble();

            double finalMark = calcFinalMark(assignment, exam);

            char grade = findGrades(finalMark);

            printDetails(name, finalMark, grade);
        }

        input.close();
    }
}