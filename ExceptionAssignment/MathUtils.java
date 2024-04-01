package ExceptionAssignment;
public class MathUtils {

	public static int factorial(int n) throws IllegalArgumentException
 {
		int fac = 1;
		if(n<0) 
			throw new IllegalArgumentException("Negative numbers are not allowed");
		if(n>16)
			throw new IllegalArgumentException("Please enter the number in the range ogf 0 to 16");
		for (int i = n; i > 0; i--)
			fac = fac * i;
		return fac;
	}
}