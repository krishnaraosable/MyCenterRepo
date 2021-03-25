package assignment1; //((((10/2)+2)-2)+2)*2)
public class Assignment {
	public int div(int d1, int d2) {
		int divResult; 
		divResult = d1/d2;
		System.out.println("Div Result : " + divResult);		
		return divResult;
	}	
	public int sum(int s1, int s2) {
		int sumResult;
		sumResult = s1+s2;
		System.out.println("Sum Result : " + sumResult);
		return sumResult;
	}	
	public int subs(int sb1,int sb2) {
		int subsResult;
		subsResult = sb1-sb2;
		System.out.println("Sub Result : " + subsResult);
		return subsResult;
	}	
	public int mult(int m1, int m2) {
		int multResult;
		multResult = m1*m2;
		System.out.println("Mult Result: " + multResult);
		return multResult;
	}
	public static void main(String[] arg) {
		int valTwo = 2;
		Assignment m = new Assignment ();
		int divRes = m.div(10,valTwo);
		int sumRes = m.sum(divRes,valTwo);
		int subRes = m.subs(sumRes, valTwo);
		int sumTRes = m.sum(subRes, valTwo);
		m.mult(sumTRes,2);
	}
}
