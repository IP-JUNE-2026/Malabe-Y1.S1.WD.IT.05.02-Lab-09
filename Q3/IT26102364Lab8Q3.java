import java.util.Scanner;

public class IT26102364Lab8Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[6];
        int count = 0;

        while (count < 6) {
            System.out.print("Enter a Positive Number (" + (count + 1) + "/6): ");
            int num = input.nextInt();

            if (num <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            } else {
                numbers[count] = num;
                count++;
            }
        }

        System.out.println("\nArray Contents:");

        int maximum = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");

            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }
        }

        System.out.println("\n\nThe Maximum Number Entered: " + maximum);

    }
}
