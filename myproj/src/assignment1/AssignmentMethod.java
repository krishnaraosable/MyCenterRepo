package assignment1;

import assignment1.AssignmentMethod;

public class AssignmentMethod {
	
	public void mDefault() {		
		System.out.println("Default method");	
		this.m4(1,2,3,4);
	}
	public void m1(int a) {
		System.out.println("1 parameterized method");
	}
	public void m2(int a, int b) {
		System.out.println("2 parameterized method");
		this.m1(1);
	}	
	public void m3(int a, int b, int c) {
		System.out.println("3 parameterized method");
		this.mDefault();
	}	
	public void m4(int a, int b, int c, int d) {
		System.out.println("4 parameterized method");
		this.m2(1, 2);
	}
	public static void main(String[] args) {
		AssignmentMethod am = new AssignmentMethod();
		am.m3(1,2,3);
	}
}
