package assignment1;
public class ClassChildMethod extends ClassParentMethod {
	
	public void defaultMethod() {
		this.m3(1, 2, 3);
		System.out.println("Child default method");
	}
	public void m1(int a) {
		this.m2(1, 2);
		System.out.println("Child 1 param method");
	}
	public void m2(int a, int b) {
		this.defaultMethod();
		System.out.println("Child 2 param method");
	}
	public void m3(int a, int b, int c) {
		super.mParent3(1,2,3);
		System.out.println("Child 3 param method");		
	}
	public void m4(int a, int b, int c, int d) {
		this.m1(1);
		System.out.println("Child 4 param method");
	}
	public static void main(String[] args ) {
		ClassChildMethod obj = new ClassChildMethod();
		obj.m4(1,2,3,4);
	}
}
