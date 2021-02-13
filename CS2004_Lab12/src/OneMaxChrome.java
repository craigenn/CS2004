import java.util.ArrayList;

public class OneMaxChrome 
{
	//The number of times the fitness function is evaluated
	private static int fc = 0;
	//This is used to store the fitness in
	private double fitness = -1;
	//The representation - a binary array
	private ArrayList<Integer> rep = new ArrayList<Integer>();
	//The set of weights we are working with
	//private static ArrayList<Double> weights = new ArrayList<Double>();
	//Reset the fitness count back to zero
	public static void ClearFC()
	{
		fc = 0;
	}
	//Get the number of times the fitness function has been called
	public static int GetFC()
	{
		return(fc);
	}
	
	//Create a Chromosome based on string 's'
	public OneMaxChrome(String s)
	{
		boolean ok = true;
		int n = s.length();
		for(int i=0;i<n;++i)
		{
			char si = s.charAt(i);
			if (si != '0' && si != '1') 
			{
				ok = false;
			}
			else
			{
				rep.add((si == '1')?1:0);
			}
		}
		if (!ok)
		{
			RandomBinary(n);
		}
	}
	//Create a Chromosome based on array 'r'
	public OneMaxChrome(ArrayList<Integer> r)
	{
		
		for(int i=0;i<r.size();++i)
		{
			if (r.get(i) < 2) rep.add(r.get(i));
		}
	}
	//Create a random binary Chromosome of length 'n' genes/bits
	public OneMaxChrome(int n) 
	{
		RandomBinary(n);
	}
	//Return the representation (as a pointer) for the Chromosome
	public ArrayList<Integer> GetRep()
	{
		return(rep);
	}
	//Copy and return the representation
	public ArrayList<Integer> CopyRep()
	{
		ArrayList<Integer> cr = new ArrayList<Integer>();
		for(int i=0;i<rep.size();++i) cr.add(rep.get(i));
		return(cr);
	}
	//Create a random binary Chromosome of length 'n' genes/bits
	private void RandomBinary(int n)
	{
		rep.clear();
		for(int i=0;i<n;++i)
		{
			Integer y = CS2004.UI(0,1);
			rep.add(y);
		}
	}
	//Compute the onemax fitness function
	public double GetFitness()
	{
		int count=0;
		
		for (int i=0;i<rep.size();++i) {
			if(rep.get(i)==1) {
				count++;
			}
		}
		fitness = count;
		return(fitness);
	}
	//Display the fitness and representation
	public void print()
	{
		System.out.print(GetFitness());
		System.out.print(" ");
		System.out.print(rep);
	}
	//Display the fitness and representation followed by a new line
	public void println()
	{
		print();
		System.out.println();
	}
}