package assignment1;
public class CreateNumber {	
	public static void main(String[] args) {
		int val = 1;		
		for(int i=0;i<5;i++) {						
			for(int k=0;k<i;k++) {	
				System.out.print(val++);				
			}			
			if(i>0) { //Condition for remove first white space
				System.out.println(" ");
			}			
		}			
	}
}