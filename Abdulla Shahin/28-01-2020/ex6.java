 import java.util.ArrayList;

    public class ex6
    {
         public static void main(String[] args)
         {       
            ArrayList<Integer> numbers=new ArrayList<Integer>();
            numbers.add(100);
            numbers.add(200);
            numbers.add(300);
            numbers.add(100);
            System.out.println("size of array list is "+numbers.size());
            numbers.add(400);
            System.out.println("size of array list after increasing :"+numbers.size());
        }
    }