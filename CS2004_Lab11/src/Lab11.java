import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Lab11 
{
	public static void main(String args[])
	{
		//Read in the weights
		//Make sure you change the filename as appropriate!
		//This will only work if "c:\temp\1000 Primes.txt" exists!
		ArrayList<Double> w = CS2004.ReadNumberFile("1000Primes.txt");
		//Set the weights
		ScalesChrome.SetWeights(w);
		//Run 10 repeats
//		for(int i=0;i<10;++i)
//		{
//			//Reset the fitness count
//			ScalesChrome.ClearFC();
//			//The following parameters are not very good!
//			//These are the ones you should try and optimise!
//			
//			int popsize = 100;
//			double mrate = 0.1;
//			double crate = 95;
//			//You will not need to change the following
//			SimpleGeneticAlgorithm ga = new SimpleGeneticAlgorithm(popsize,10,1000,mrate,crate);
//			//Run the GA for 10,000 function calls
//			double f = ga.RunSGA(10000,true).GetFitness();
//			System.out.println(f);
//			// 1. inter, 2. fitness count (number of times fitness called) 
//			//3. avg population 4. final fitness
//		}
		
		run(1);
	}
	
	public static void run(int j) {
		for(int i=0;i<j;++i)
		{
			//Reset the fitness count
			ScalesChrome.ClearFC();
			//The following parameters are not very good!
			//These are the ones you should try and optimise!
			
			int popsize = 100;
			double mrate = 0.1;
			double crate = 95;
			//You will not need to change the following
			SimpleGeneticAlgorithm ga = new SimpleGeneticAlgorithm(popsize,10,1000,mrate,crate);
			//Run the GA for 10,000 function calls
			double f = ga.RunSGA(10000,true).GetFitness();
			System.out.println(f);
			// 1. inter, 2. fitness count (number of times fitness called) 
			//3. avg population 4. final fitness
		}
	}
	
	
		
}
