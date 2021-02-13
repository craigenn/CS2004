
public class Lab12 {

	
	public static void main(String args[]) {
		
	}
	
	
	public static void run(int j) {
		for(int i=0;i<j;++i)
		{
			//Reset the fitness count
			OneMaxChrome.ClearFC();
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
