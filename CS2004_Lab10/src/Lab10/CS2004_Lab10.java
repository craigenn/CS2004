package Lab10;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CS2004_Lab10 {
	/*Author: Craig Saville  Brunel University year 2
	//	1)	What is the maximum range of K12? What angle and muzzle velocity is needed?
	//	Current distance: 113594.09335756407
	//	Current angle: 53.53272786391301
	//	Current velocity: 1650.0
	//	Current iter: 20007
	//			2)	What is the minimum range of K12? What angle and muzzle velocity is needed?
	//	Current distance: 50091.29062658121
	//	Current angle: 25.0
	//	Current velocity: 1500.0
	//	Current iter: 68
	//			3)	What angle and muzzle velocity is needed to hit a target 75,000 metres away? How close can you get?
	  	Current distance: 75000.00330973789
		Current angle: 35.556221649259456
		Current velocity: 1562.6885606299395
		Current iter: 20941
	//			4)	What angle and muzzle velocity is needed to hit a target 95,000 metres away? How close can you get?
	  	Current distance: 94999.99450676398
		Current angle: 40.17936205161097
		Current velocity: 1650.0
		Current iter: 42059
	//			5)	What angle and muzzle velocity is needed to hit a target 65,000 metres away? How close can you get?
	//	Current distance: 64999.97668746323
	//	Current angle: 30.769356578954923
	//	Current velocity: 1576.7213544363403
	//	Current iter: 2732

	 */
	public static void main(String args[]) {


		//		double r = Cannon.GetMaxRange(40.0,1575.0);
		//		System.out.println(r);
		//		ArrayList<Double> xt = Cannon.GetX();
		//		ArrayList<Double> yt = Cannon.GetY();
		//		System.out.println(xt.size());
		//		System.out.println(yt.size());
		//		try {
		//			CSV(xt,yt);
		//		} catch (FileNotFoundException e) {
		//			// TODO Auto-generated catch block
		//			e.printStackTrace();
		//		}
		//1 for max 2 for min
		//RMHC(50000,2);
		RMHCTarget(50000, 95000);

	}

	public static void RMHC(int iter, int check) {
		CannonSolution sol = new CannonSolution();

		double r = Cannon.GetMaxRange(sol.getA(), sol.getV());
		System.out.println(r);
		for(int i=0;i<iter;i++) {
			CannonSolution newsol = new CannonSolution(sol.getA(), sol.getV());
			newsol.smallChange();
			double newr = Cannon.GetMaxRange(newsol.getA(), newsol.getV()); 
			if(check == 1) {
				if(newr > r) {
					r = newr;
					sol = newsol;
					System.out.println("Current distance: " + r);
					System.out.println("Current angle: " + sol.getA());
					System.out.println("Current velocity: " + sol.getV());
					System.out.println("Current iter: " + i);
				}			
			}else if(check == 2) {
				if(newr < r) {
					r = newr;
					sol = newsol;
					System.out.println("Current distance: " + r);
					System.out.println("Current angle: " + sol.getA());
					System.out.println("Current velocity: " + sol.getV());
					System.out.println("Current iter: " + i);

				}
			}
		}
	}
	public static void RMHCTarget(int iter, int target) {
		CannonSolution sol = new CannonSolution();

		double r = Cannon.GetMaxRange(sol.getA(), sol.getV());
		System.out.println(r);

		for(int i=0;i<iter;i++) {
			CannonSolution newsol = new CannonSolution(sol.getA(), sol.getV());
			newsol.smallChange();
			double newr = Cannon.GetMaxRange(newsol.getA(), newsol.getV()); 
			double fitness = Math.abs(r-target);
			double newFitness = Math.abs(newr - target);

			if(newFitness < fitness) {
				r = newr;
				sol = newsol;
				System.out.println("Current distance: " + r);
				System.out.println("Current angle: " + sol.getA());
				System.out.println("Current velocity: " + sol.getV());
				System.out.println("Current iter: " + i);
			}			

		}
	}






	public static void CSV (ArrayList<Double> X, ArrayList<Double> Y) throws FileNotFoundException{

		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter("test.csv");
			fileWriter.append("X");
			fileWriter.append("Y");
			fileWriter.append("\n");

			for (int i = 0; i < X.size(); i++) {
				fileWriter.append(Double.toString(X.get(i)));
				fileWriter.append(",");
				fileWriter.append(Double.toString(Y.get(i)));
				fileWriter.append("\n");
			}
			System.out.println("success");
		}
		catch (Exception e) {
			System.out.println("Error in FileWriter");
			e.printStackTrace();
		}
		finally {
			try {
				fileWriter.flush();
				fileWriter.close();
			}
			catch (IOException e) {
				System.out.println("Error closing fileWriter");
				e.printStackTrace();

			}
		}
	}




}
