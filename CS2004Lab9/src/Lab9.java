import java.util.ArrayList;

public class Lab9 {

	static String filename = "1000Primes.txt";

	public static void main(String args[]) {


		ArrayList<Double> weights = new ArrayList<Double>();
		weights = CS2004.ReadNumberFile(filename);
		ScalesSolution HC = RMHC(weights,1000,2000000);
		System.out.println("HC answer: ");
		HC.println();
		//		for (int i=0;i<15;i++) {
		//			ScalesSolution s = new ScalesSolution("11111");
		//			s.println();
		//			s.SmallChange();
		//			s.println();
		//		}


		//		ScalesSolution s1 = new ScalesSolution(10);
		//		s1.println();
		//		ScalesSolution s2 = new ScalesSolution(s1.GetSol());
		//		s2.println();

	}



	public static ScalesSolution RMHC(ArrayList<Double> weights,int n,int iter) {
		ScalesSolution sol = new ScalesSolution(n);
		double fitness = sol.ScalesFitness(weights);

		System.out.println("first run: ");
		sol.println();
		System.out.println("first fitness: " + fitness);
		System.out.println();
		for(int i = 0 ; i<iter;i++) {
			ScalesSolution newSol = new ScalesSolution(sol.GetSol());
			newSol.SmallChange();
			double newFitness = newSol.ScalesFitness(weights);
			if(fitness>=newFitness) {
				fitness = newFitness;
				sol = newSol;
				System.out.println("Current Fitness: " + fitness);
				System.out.println("Current iter: " + i);
			}
			//1000 length and prime weights
			//typically takes about 300 iterations to hit 1 fitness,
			//worst was 7257 to hit 1 fitness
			//worst case outside of target was 11 fitness after 2,000,000 iterations.
			

		}

		System.out.println("Final Solution: ");
		sol.println();
		System.out.println();
		System.out.println("Final Fitness: " + fitness);




		return(sol);
	}





}







