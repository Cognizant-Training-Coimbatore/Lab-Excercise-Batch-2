import java.util.LinkedList;
import java.util.Iterator;
  public class Q9 {
  public static void main(String[] args) {
    
     LinkedList<String> List = new LinkedList<String>();
   
          List.add("Red");
          List.add("Green");
          List.add("Black");
          List.add("White");
          List.add("Pink");

   Iterator p = List.listIterator(1);

   
   while (p.hasNext())
   {
   System.out.println(p.next());
   }
   }
}