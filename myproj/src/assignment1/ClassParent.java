package assignment1;
public class ClassParent {	
	public ClassParent() {
		this(1,2,3);
		System.out.println("Parent defult constructor");
	}	
	public ClassParent(int a) {
		this();
		System.out.println("Parent 1 parameterized constructor");
	}	
	public ClassParent(int a, int b) {
		this(1);
		System.out.println("Parent 2 parameterized constructor");
	}	
	public ClassParent(int a, int b, int c) {
		System.out.println("Parent 3 parameterized constructor");
	}
	public ClassParent(int a, int b, int c, int d) {
		this(1,2);
		System.out.println("Parent 4 parameterized constructor");
	}
	public static void main(String[] args) {
		ClassParent obj = new ClassParent();
	}

}
