import java.util.*;

public class Q11
{
 public static void main(String[] args) {

  LinkedList <String> List = new LinkedList <String> ();

  List.add("Blue");
  List.add("Green");
  List.add("Black");
  List.add("Pink");
  List.add("Yellow");
 
  System.out.println("The Original linked list: " + List);
  
   
    Collections.swap(List, 0, 2);
    System.out.println("The New linked list after swap: " + List);
 }
}