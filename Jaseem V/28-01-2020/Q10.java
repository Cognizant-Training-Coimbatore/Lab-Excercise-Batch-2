import java.util.LinkedList;
import java.util.Iterator;
  public class Q10 {
  public static void main(String[] args) {
    
     LinkedList<String> List = new LinkedList<String>();
  
          List.add("Blue");
          List.add("Green");
          List.add("Black");
          List.add("Pink");
          List.add("Yellow");
      
     
   System.out.println("Original linked list:" + List);  
 
   
    Object first_element = List.getFirst();
    System.out.println("First Element is: "+first_element);
 
    
    Object last_element = List.getLast();
    System.out.println("Last Element is: "+last_element);
 }
}