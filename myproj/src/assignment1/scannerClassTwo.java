package assignment1; //((((x1/x2)+x3)-x4)-x5)*x6)
import java.util.Scanner;
public class scannerClassTwo {
	public int division(int a, int b) {
		int c = a/b;
		System.out.println("Division result : " + c); return c;
	}
	public int sum(int a, int b) {
		int c = a+b;
		System.out.println("Sum result : " + c); return c;
	}
	public int substraction(int a, int b) {
		int c = a-b;
		System.out.println("Substraction result : " + c); return c;
	}
	public int mult(int a, int b) {
		int c = a*b;
		System.out.println("Multiplication result : " + c); return c;
	}
	public static void main(String args[]) {
		scannerClassTwo sClTwo = new scannerClassTwo();
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		int res1 =  sClTwo.division(input1, input2);//division
		int input3 = sc.nextInt();
		int res2 = sClTwo.sum(res1, input3);//Sum
		int input4 = sc.nextInt();
		int res3 = sClTwo.substraction(res2, input4);//Substraction 1
		int input5 = sc.nextInt();
		int res4 = sClTwo.substraction(res3, input5);//Substraction 2
		int intput6 = sc.nextInt();
		int res5 = sClTwo.mult(res4, input5);//Multiplication
	}

}
