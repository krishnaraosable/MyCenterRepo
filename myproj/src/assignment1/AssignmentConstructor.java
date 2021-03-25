package assignment1;
public class AssignmentConstructor {
	public AssignmentConstructor() {
		this(1,2,3,4);
		System.out.println("Default constructor");
	}
	public AssignmentConstructor(int a) {
		this();
		System.out.println("1 parameterized constructor");
	}
	public AssignmentConstructor(int a, int b) {
		this(1,2,3);
		System.out.println("2 parameterized constructor");
	}
	public AssignmentConstructor(int a, int b, int c) {
		this(1);
		System.out.println("3 parameterized constructor");
	}
	public AssignmentConstructor(int a, int b, int c, int d) {		
		System.out.println("4 parameterized constructor");
	}
	
	public static void main(String[] args) {
		AssignmentConstructor m = new AssignmentConstructor (1,2);
	}
}
