package assignment1; //((((x1+x2)+x3)-x4)/x5)*x6)
import java.util.Scanner;
public class scannerClass {	
	public int sum(int a, int b) {
		int c = a+b;
		System.out.println("Sum result : " + c); return c;
	}
	public int substract(int a, int b) {
		int c = a-b;
		System.out.println("Substraction result : " + c); return c;
	}	
	public int division(int a, int b) {
		int c = a/b;
		System.out.println("division result : " + c); return c;
	}	
	public int mult(int a, int b) {
		int c = a*b;
		System.out.println("multiplication result : " + c); return c;
	}
	public static void main(String[] args) {		
		scannerClass sCls = new scannerClass();		
		Scanner sc = new Scanner(System.in);
		int intput1 = sc.nextInt();		
		int intput2 = sc.nextInt();
		int res1 = sCls.sum(intput1, intput2); //Sum 1
		int intput3 = sc.nextInt();
		int res2 = sCls.sum(res1, intput3); //Sum 2
		int intput4 = sc.nextInt();
		int res3 = sCls.substract(res2,intput4); //multiplication
		int intput5 = sc.nextInt();
		int res4 = sCls.division(res3,intput5); //division
		int intput6 = sc.nextInt();
		int res5 = sCls.mult(res4,intput6); //multiplication
	}
}
