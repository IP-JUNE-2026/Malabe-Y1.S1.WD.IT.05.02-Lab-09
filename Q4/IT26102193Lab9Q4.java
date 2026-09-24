import java.util.Scanner;

public class IT26102193Lab9Q4 {

   public static double calcFinalMark(double assignmentMark, double examMark){
	   return(assignmentMark * 0.3 + examMark * 0.7);
   }
	   
	   public static char findGrades(double finalMark){

	   
		   
		   if (finalMark >= 75){
			   return 'A';
		   }else if (finalMark >= 60) {
			    return 'B';
		   }else if (finalMark >= 50) {
			    return 'C';
		   }else {
			   return 'F';
		}
	   }
 
      public static void printDetails (String names, double finalMark, char grade){
		  
		  System.out.println(names + "\t\t" + String.format("%.2f" , finalMark) + "\t\t" + grade);
	  }
	  
	  public static void main(String[] args) {
		  
		  Scanner input = new Scanner(System.in);
		  
		  String[] names = new String[5];
		  double[] assignmentMark = new double[5];
		  double[] examMark = new double[5];
		  double[] finalMark = new double[5];
		  char[] grade = new char[5];
		  
		  for(int i = 0; i < 5; i++){
			  
			  
			  
			  System.out.print("Enter Name of Student " + (i+1) +": ");
			  names[i] = input.nextLine();
			  
			  System.out.print("Enter Assignment Mark (out of 100) for " +names[i] +": ");
			  assignmentMark[i] = input.nextDouble();
			  
			  System.out.print("Enter Exam Paper Mark (out f 100) for " +names[i] +": ");
			  examMark[i] = input.nextDouble();
			  
			  input.nextLine();
			  
			  finalMark[i] = calcFinalMark(assignmentMark[i], examMark[i]);
			  grade[i] = findGrades(finalMark[i]);
			  
			  System.out.println();
			  
		  }
		  
		  System.out.println("Name\t\tFinal Mark\tGrade");
		  
		  for(int i = 0; i < 5; i++){
			  
			  printDetails(names[i], finalMark[i], grade[i]);
			  
		  }
	  }
}

			  
		  
		  
		  
			  
			  
			  
		  
		  
		   
		   
	   
   