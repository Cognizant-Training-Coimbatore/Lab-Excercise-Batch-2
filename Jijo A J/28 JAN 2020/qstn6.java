    import java.util.ArrayList;
    public class qstn6 {
         public static void main(String[] args) {
             
            ArrayList<Integer> numbers=new ArrayList<Integer>();
            numbers.add(100);
            numbers.add(200);
            numbers.add(300);
            numbers.add(100);
           // now the capacity of the ArrayList numbers is 10
           System.out.println("size of array list is "+numbers.size());
           numbers.add(400);
           System.out.println("size of array list after increasing :"+numbers.size());
           
           // now the capacity will be 15
           
          
        }
    }