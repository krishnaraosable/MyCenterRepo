package assignment1;
public class AssignmentMethod1 {
	public void mDefault() {		
		this.m3(1,2,3);
		System.out.println("Default method");	
	}
	public void m1(int a) {
		this.m2(1,2);
		System.out.println("1 parameterized method");
	}
	public void m2(int a, int b) {
		this.m4(1,2,3,4);
		System.out.println("2 parameterized method");
	}	
	public void m3(int a, int b, int c) {
		System.out.println("3 parameterized method");
	}	
	public void m4(int a, int b, int c, int d) {
		this.mDefault();
		System.out.println("4 parameterized method");
	}
	public static void main(String[] args) {
		AssignmentMethod1 am = new AssignmentMethod1();
		am.m1(1);
	}
}
