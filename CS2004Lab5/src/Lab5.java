import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class Lab5 {
    public static LinkedList<Data> LList = new LinkedList<Data>();
    public static ArrayList<Data> ArrayA = new ArrayList<Data>();
    public static ArrayList<Data> ArrayB = new ArrayList<Data>();
    public static ArrayList<Data> ArrayC = new ArrayList<Data>();
    public static  ArrayList<Data> ArrayD = new ArrayList<Data>();
    public static Stack<Data> stack = new Stack<Data>();
    public static ArrayBlockingQueue<Data> q = new ArrayBlockingQueue<Data>(10);


    public static void main(String args[]){


        Data x = new Data("Fred",41);
        x.Print();
        arrayfiller();
        PrintCollection(LList);
        System.out.println("A=B:");
        arrayprintA();
        System.out.println();
        System.out.println();
        System.out.println("cloning:");
        arrayprintB();

        System.out.println();
        System.out.println();
        System.out.println("Stacks:");

        stackfiller();
        stackpractise();
        System.out.println();
        System.out.println();

        System.out.println("Queues:");
        queuefillerlist();
        queuepractise();
        queuefiller();

    }

    public static void PrintCollection(Collection<Data> c){

        for (Iterator<Data> iter = c.iterator(); iter.hasNext();)
        {
            Data x = (Data)iter.next();
            x.Print();
        }
        System.out.println();
    }

    public static void arrayfiller(){
        ArrayA.add(new Data("Fred", 21));
        ArrayA.add(new Data("Jo", 43));
        ArrayA.add(new Data("Zoe", 37));
        ArrayC.add(new Data("Fred", 21));
        ArrayC.add(new Data("Jo", 43));
        ArrayC.add(new Data("Zoe", 37));
        LList.add(new Data("Fred", 21));
        LList.add(new Data("Jo", 43));
        LList.add(new Data("Zoe", 37));
    }

    public static void arrayprintA(){
        PrintCollection(ArrayA);
        System.out.println();
        ArrayB = ArrayA;
        PrintCollection(ArrayB);
        System.out.println();
        ArrayA.remove(1);
        PrintCollection(ArrayB);
    }

    public static void arrayprintB(){
        PrintCollection(ArrayC);
        System.out.println();

        ArrayD = (ArrayList<Data>)ArrayC.clone();
        ArrayC.remove(1);
        PrintCollection(ArrayC);
        System.out.println();
        PrintCollection(ArrayD);
        System.out.println();
    }

    public static void stackfiller(){
        stack.push(new Data("Fred", 21));
        stack.push(new Data("Jo", 43));
        stack.push(new Data("Zoe", 37));
    }

    public static void stackpractise(){
        while(stack.isEmpty() == false)
        {
            stack.pop().Print();
        }
        System.out.println(stack.size());
        //Implement the following code that manipulates the stack, what does it do?
        // prints the stack LIFO style
    }

    public static void queuefillerlist(){
        q.add(new Data("Fred", 21));
        q.add(new Data("Jo", 43));
        q.add(new Data("Zoe", 37));
    }

    public static void queuefiller(){
        for(int i=0;i<20;++i)
        {
            q.offer(new Data("Test:"+String.valueOf(i),i));
        }
        PrintCollection(q);
//        Run the code. Observe the results. Now change the for loop limit from 10 to 20. What happens?
//        Why? Now change the add method to the offer method. What happens?
//        What does offer return? Under what conditions?
        
//        Offer is preferable as it offers the variable but if the queue is full it is ignored
//        rather than throwing an exception like the add
    }
    public static void queuepractise(){
        while(q.isEmpty() == false)
        {
            q.poll().Print();
        }
        System.out.println(q.size());


    }
    //What do you notice ABOUT ARRAYLIST HOLDING ARRAYLIST? How can you explain this?
    // as Arraylist stores another Arraylist any changes to ArraylistA happen to ArraylistB

    // :does not copy the contents of ArrayA to ArrayB, it simply points ArrayB at the contents of ArrayA.
    // This means that both arrays share the same data.
    // Any items added or deleted to one will be effectively added or deleted from the other.

    //cloning copies the arraylists so any changes to the original does not continue when calling the cloned one


}
