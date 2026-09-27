import java.util.Scanner;

public class IT26102355Lab9Q4 {

    public static double calcFinalMark(double assignment, double exam) {
        double x = assignment * 0.3;
        double y = exam * 0.7;

        return x + y;
    }

    public static char findGrades(double a) {
        if (a >= 75) {
            return 'A';
        } else if (a >= 60) {
            return 'B';
        } else if (a >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }

    public static void printDetails(String Name, double FinalMark, char Grade) {
        System.out.printf("%-20s %-15.2f %c%n", Name, FinalMark, Grade);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = new String[5];
        double[] finalMarks = new double[5];

        int i = 0;

        while (i < 5) {
            System.out.println("Enter the name of student " + (i + 1));

            System.out.print("Enter name: ");
            names[i] = input.nextLine();

            System.out.print("Enter assignment mark (out of 100): ");
            double assignment = input.nextDouble();

            System.out.print("Enter exam mark (out of 100): ");
            double exam = input.nextDouble();

            input.nextLine();

            finalMarks[i] = calcFinalMark(assignment, exam);

            System.out.println();
            i++;
        }

        System.out.printf("%-20s %-15s %s%n", "Name", "Final Mark", "Grade");

        i = 0;

        while (i < 5) {
            char grade = findGrades(finalMarks[i]);
            printDetails(names[i], finalMarks[i], grade);
            i++;
        }
    }
}