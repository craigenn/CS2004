

import java.util.*;
import java.io.*;

//Some useful code that we will probably reuse in later laboratories...
public class CS2004 
{

	static String filename = "1000Primes.txt";

	public static void main(String args[])
	{
		ArrayList<Double> res = new ArrayList<Double>();
		//relative file path since it is in the project directory
		


		//System.out.println(ScalesSolution.RandomBinaryString(10));
		//System.out.println("done");
		
		//above code was done to quickly check it was working correctly 
		//changed method to public when checking

		//the below is the original code supplied moved into its own method
		
		//original();

		//the below will create a new solution to the Scales problem of 5 weights 
		//called x with the odd weights on the right hand side of the scales 
		//and the even weights on the left hand side.
		
		//Scales();


		//the below method inputs a nonbinary so it gets replaced
		
		//Scalesbreak();

//		res = ReadNumberFile(filename);
//		checkread(res);
		
	}
	
	
	

	
	

	public static void original() {
		for(int i=0;i<10;++i)
		{
			int x = CS2004.UI(-1, 1);
			System.out.println(x);
		}
	}
	//Shared random object
	static private Random rand;
	//Create a uniformly distributed random integer between aa and bb inclusive
	static public int UI(int aa,int bb)
	{
		int a = Math.min(aa,bb);
		int b = Math.max(aa,bb);
		if (rand == null) 
		{
			rand = new Random();
			rand.setSeed(System.nanoTime());
		}
		int d = b - a + 1;
		int x = rand.nextInt(d) + a;
		return(x);
	}
	//Create a uniformly distributed random double between a and b inclusive
	static public double UR(double a,double b)
	{
		if (rand == null) 
		{
			rand = new Random();
			rand.setSeed(System.nanoTime());
		}
		return((b-a)*rand.nextDouble()+a);
	}
	//This method reads in a text file and parses all of the numbers in it
	//This code is not very good and can be improved!
	//But it should work!!!
	//It takes in as input a string filename and returns an array list of Doubles
	static public ArrayList<Double> ReadNumberFile(String filename)
	{
		ArrayList<Double> res = new ArrayList<Double>();
		Reader r;
		try
		{
			r = new BufferedReader(new FileReader(filename));
			StreamTokenizer stok = new StreamTokenizer(r);
			stok.parseNumbers();
			stok.nextToken();
			while (stok.ttype != StreamTokenizer.TT_EOF) 
			{
				if (stok.ttype == StreamTokenizer.TT_NUMBER)
				{
					res.add(stok.nval);
				}
				stok.nextToken();
			}
		}
		catch(Exception E)
		{
			System.out.println("+++ReadFile: "+E.getMessage());
		}
		return(res);
	}

	static public void checkread(ArrayList<Double> res) {
		for(int i=0;i<res.size();i++) {
			System.out.print(res.get(i) + ", ");
		}
	}

}