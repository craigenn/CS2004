package Lab7;


import java.util.Random;

public class Lab7 {

	public static void main(String[] args) {
		
		double g[][] = {{0,1,2},{1,0,3},{2,3,0}};
		double fivepoint[][]= {{0,1,2,3,0}, {1,0,6,0,5}, {2,6,0,4,1}, {3,0,4,0,2}, {0,5,1,2,0}};
		double mstfive[][]=MST.PrimsMST(fivepoint);
 		double mst[][] = MST.PrimsMST(g);
 		double randomarray[][] = arrays(500);
 		double randomMST[][] =MST.PrimsMST(randomarray);
 		
		System.out.println("Tree:");
		printarray(g);
		spacemaker();
		System.out.println("Minimum spanning tree:");
		printarray(mst);
		spacemaker();
		System.out.println("Five node tree:");
		printarray(fivepoint);
		spacemaker();
		System.out.println("Minimum spanning tree:");
		printarray(mstfive);
		
		spacemaker();
		System.out.println("new random array:");
		printarray(randomarray);
		spacemaker();
		
		long timestart = System.currentTimeMillis();
		System.out.println("Minimum spanning tree of random array:");
		printarray(randomMST);
		long timefinish = System.currentTimeMillis();
		long timerun = timefinish-timestart;
		System.out.println(timerun);

	}

	public static void printarray(double data[][]) {
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data.length;j++) {
				System.out.print(data[i][j]+ "|");
			}
			System.out.println();
		}
	}
	
	
	public static void spacemaker() {
		System.out.println();
	}
	
	public static double[][] arrays(int n){
		double array[][] = new double [n][n];
		int r;
		  Random rand = new Random();
		  for(int i=0;i<n;i++) {
			  for(int j=0;j<n;j++) {
				  r = Math.abs(rand.nextInt() % 100);
				  array[i][j] = r;
			  }
		  }
		
		return array;
		
	}
	
	public static void printarrayint(int data[][]) {
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data.length;j++) {
				System.out.print(data[i][j]+ "|");
			}
			System.out.println();
		}
	}
	
	
//	1)	Create a method RandomArray that takes in as parameter an integer n and returns an n by n double array where each element is a random natural (integer 0) number between zero and 100 inclusive. This will create a random graph. It is vital that you make sure that the matrix is symmetric (see above). You should be able to reuse some of the code written for previous worksheets…
//	2)	Verify that the method produces the expected results, and that the matrix is symmetric.
//	3)	Conduct a set of experiments where you generate a number of random graphs varying in size from 100 nodes to 500 nodes, and then time how long the MST takes to run. Repeat each of these experiments a number of times, and then average the results.
//	100 elements = 32 miliseconds
//	200 elements = 	383 miliseconds	
//	500 elements =  606 miliseconds
//	4)	Plot a graph of the average run time against the size of the graph. An example (similar) graph can be seen in the Sorting Algorithms worksheet.

}
