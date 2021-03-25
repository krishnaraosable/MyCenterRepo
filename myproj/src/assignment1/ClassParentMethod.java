package assignment1;
public class ClassParentMethod {
	
	public void defaultMethod1() {
		this.mParent2(1, 2);
		System.out.println("Parent default method");
	}	
	public void mParent1(int a) {
		this.mParent4(1,2,3,4);
		System.out.println("Parent 1 param method");
	}	
	public void mParent2(int a, int b) {
		System.out.println("Parent 2 param method");
	}	
	public void mParent3(int a, int b, int c) {
		this.mParent1(1);
		System.out.println("Parent 3 param method");
	}	
	public void mParent4(int a, int b, int c, int d) {
		this.defaultMethod1();
		System.out.println("Parent 4 param method");
	}
	
//	public static void main(String[] args) {
//		new ClassParentMethod();
//		//obj.mParent3(1,2,3);
//	}
}
