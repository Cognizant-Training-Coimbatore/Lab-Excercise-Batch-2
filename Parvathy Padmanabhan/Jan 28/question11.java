import java.util.LinkedList;
import java.util.Scanner;
  public class question11 {
  public static void main(String[] args) {
    // create an empty linked list
     LinkedList<String> l_list = new LinkedList<String>();
   // use add() method to add values in the linked list
          l_list.add("Red");
          l_list.add("Green");
          l_list.add("Black");
          l_list.add("Pink");
          l_list.add("orange");
      
      // print original list
   System.out.println("Original linked list:" + l_list);  
 
   // Find first element of the List
   System.out.println("Enetr the positions to be swapped");
   Scanner sc=new Scanner(System.in);
   int x=sc.nextInt();
   int y=sc.nextInt();
    String first_element = l_list.get(x);
    l_list.set(x,l_list.get(y));
    l_list.set(y,first_element);
    
    System.out.println("Original linked list:" + l_list);  
    sc.close();
 }
}