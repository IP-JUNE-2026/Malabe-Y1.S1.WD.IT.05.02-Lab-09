import java.util.Scanner;

public class IT26102355Lab9Q3{
	
	public static int add(int a, int b){
		return (a+b);
	}
		
		
	public static int multiply(int a, int b){
		return (a*b);
	}
		
		
	public static int square(int n){
		return (n*n);
	}
		
	
	public static void main(String[] args) {
		
		int par1 = multiply(3,4);
		int par2 = multiply(5,7);
		int sum1 = add(par1,par2);
		int ans1 = square(sum1);
		
		int par3 = add(4,7);
		int par4 = add(8,3);
		int sq1 = square(par3);
		int sq2 = square(par4);
		int ans2 = add(sq1,sq2);
		
		System.out.println("Result of (3*4+5*7)^2 : " +ans1 );
		System.out.print("Result of (4+7)^2 + (8+3)^2 : " +ans2);
	}
}