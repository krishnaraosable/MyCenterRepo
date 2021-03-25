package assignment1;
public class ClassChild extends ClassParent {	
	public ClassChild() {
		super(1,2,3,4);
		System.out.println("Child default constructor");
	}	
	public ClassChild(int a) {
		this(1,2,3);
		System.out.println("Child 1 parameterized constructor");
	}	
	public ClassChild(int a, int b) {
		this(1,2,3,4);
		System.out.println("Child 2 parameterized constructor");
	}	
	public ClassChild(int a, int b, int c) {
		this(1,2);
		System.out.println("Child 3 parameterized constructor");
	}	
	public ClassChild(int a, int b, int c, int d) {
		this();
		System.out.println("Child 4 parameterized constructor");
	}	
	public static void main(String[] args) {
		ClassChild obj = new ClassChild(1);
	}
}
