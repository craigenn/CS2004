package lab1;

import javax.swing.JOptionPane;

/**
   This program computes square roots of user-supplied inputs.
*/
public class RootApproximationTest
{  
   public static void main(String[] args)
   {  
      boolean done = false;
      while (!done)
      {  
         String input = JOptionPane.showInputDialog("Enter a number, Cancel to quit");

         if (input == null)
         {
            done = true;
         }
         else
         {  
            double x = Double.parseDouble(input);
            RootApproximator r = new RootApproximator(x);
            double y = r.getRoot();
            
            System.out.println("square root of " + x + " = " + y);
         }
      }
   }
}
/**
Think about the following questions:

1)	How to randomly generate inputs of a given size within RootApproximationTest? 
random r = new random();

line 23 = double x = r.nextDouble();
2)	How to measure the running time of an algorithm?
line 12 timestart = system.currenttimemillis() 
line 26 timeend = system.currenttimemillis(); System.out.println(result = timeend - timestart);


for working out without running:
count number of iterations by adding a counter then count number of operations 
n = number of loops
6 for variables then 13 per loop)

    T(6 + 13n)
    O(n)

*/

