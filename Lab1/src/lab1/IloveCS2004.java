package lab1;

/**
 * filename: ILoveCS2004.java
 * Author: Your Name!
 * Date: Jan. 01, 1978 (or Today’s date!)
 */
public class IloveCS2004
{
	static double value=64;
	public static void main(String[] args)
	{
	    System.out.println("I love CS2004!");
	    heron();
	}
	
	
	public static void heron() {
		RootApproximator tester = new RootApproximator(value);
		
		System.out.println(tester.getRoot());
		
	}
	
	
}
