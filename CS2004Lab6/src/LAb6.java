import java.util.ArrayList;
import java.util.*;
public class LAb6 {
    public static ArrayList<Integer> array = new ArrayList<Integer>();
    public static ArrayList<Integer> arraysorted = new ArrayList<Integer>();
    public static void main(String args[]){




        //bubble
        System.out.println("Bubble sort:");
        array = fillarray(25);
        arraysorted = sortings.SortA(array);
        showarray(arraysorted);
        array.clear();
        arraysorted.clear();

        //Radix
        System.out.println("Radix sort:");
        array = fillarray(25);
        arraysorted = sortings.SortC(array);
        showarray(arraysorted);
        array.clear();
        arraysorted.clear();

        //Quicksort
        System.out.println("Quick sort:");
        array = fillarray(25);
        arraysorted = sortings.SortC(array);
        showarray(arraysorted);
        array.clear();
        arraysorted.clear();


        //Experimental analysis
        System.out.println("bubble sort:");
        bubbletest();
        System.out.println("radix sort:");
        radixtest();
        System.out.println("quick sort:");
        quicktest();




    }

    public static ArrayList<Integer> fillarray(int n){
        Random rand = new Random();
        ArrayList<Integer> array = new ArrayList<Integer>();
        rand.setSeed(System.currentTimeMillis());
        Integer r;

        for(int i=0;i<n;i++){
            r = Math.abs(rand.nextInt() % 256);
            array.add(r);
        }
        return array;
    }
    public static void showarray(ArrayList<Integer> arraysorted){
        for(int i=0;i< arraysorted.size()-1;i++){
            System.out.println(arraysorted.get(i));
        }
    }


    public static void bubbletest(){
        //bubble
        array = fillarray(25000);
        long timebubble = System.currentTimeMillis();
        arraysorted = sortings.SortA(array);
        System.out.println(System.currentTimeMillis()- timebubble);
    }

    public static void radixtest(){
        //radix

        array = fillarray(25000);
        long timeradix = System.currentTimeMillis();
        arraysorted = sortings.SortB(array);
        System.out.println(System.currentTimeMillis()- timeradix);
    }

    public static void quicktest(){
        //quicksort

        array = fillarray(25000);
        long timequick = System.currentTimeMillis();
        arraysorted = sortings.SortC(array);
        System.out.println(System.currentTimeMillis()- timequick);
    }

    /*
    1)	Create a method RandomArray that takes in as parameter an integer n and returns a ArrayList of Integers (ArrayList<Integer>) that consists of n random numbers between 0 and 255 (i.e. the returned array is of size n). Appendix A contains some example code that might be useful.
    2)	Create a method ShowArray that takes in as a parameter an ArrayList of Integers (ArrayList<Integer>) and displays the contents of the ArrayList.
    3)	Test these two methods, i.e. create a random list and then display it.
    4)	Verify with a small sized random array that the three sorting methods do indeed sort an ArrayList.
    5)	What order do they sort the arrays in?
    DESCENDING

    6)	Can you tell from the source code which type of sorting method the three algorithms are?

    SortA = Bubble
    SortB = Radix
    SortC = Quicksort

    */





    /*
    Experimental analysis

    7)	Which one is the overall fastest and which one is the slowest algorithm? Rank the algorithms from fastest to slowest.
    radix sort - especially for larger sizes
    quicksort
    bubble sort

    sorting 2.5million items times in seconds:
    radix sort:
    1.033
    quick sort:
    38.761
    8)	Is this ranking independent of the size of the input? I.e. does it always hold true?
    Would you use one algorithm for smaller sizes, and another for larger?
    if sorting 1000's of items quicksort is faster by a small margin, anything over 10,000 and radix is significantly faster
    especially in the millions of items range

    9)	What is the largest sized array the best method can sort in a reasonable amount of time?
    25million in 6.6 seconds on my PC
    10)	What is the largest sized array the slowest can sort in a reasonable amount of time?
    25000 in 3.8 seconds
    */


}
