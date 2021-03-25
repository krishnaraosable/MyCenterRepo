package assignment1;

public class example1 {
	public static void main(String[] args) {
		example1 ex = new example1();
		
		/*
		 * for(int i=0; i<5; i++) { System.out.print("*");
		 * 
		 * for(int j=0; j<4-i; j++) { System.out.print("*"); } System.out.println(""); }
		 */	
		
		/*
		 * for(int i=0; i<5; i++) { System.out.print("*");
		 * 
		 * for(int j=0; j<i; j++) { System.out.print("*"); } System.out.println(""); }
		 */
		
		/*
		 * for(int i=0; i<5; i++) { for(int j=0; j<4-i; j++) { System.out.print(" "); }
		 * for(int k=0; k<=i; k++) { System.out.print("*"); } System.out.println(""); }
		 */
		
		for(int i=0; i<5; i++) {						
			 for(int j=0; j<4-i; j++) { 
				 System.out.print(" ");				 				
			 }
			 for(int k=0; k<=i; k++) {
				 System.out.print("*");
			 }
			 for(int l=1; l<=i; l++) {
				 System.out.print("*");
			 }
			 System.out.println("");
		}
	}
}
