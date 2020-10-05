package lab1;

public class Numeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 /**
    Tests whether two floating-point numbers are
    equal, except for a roundoff error
    x a floating-point number
    y a floating-point number
    returns true if x and y are approximately equal
 */
 public static boolean approxEqual(double x, double y)
 {  
    final double EPSILON = 1E-10;
    if (Math.abs(x-y)<EPSILON)
    {
  	  return(true);
    }
    return(false);
 }
 // more numeric methods can be added here

}
