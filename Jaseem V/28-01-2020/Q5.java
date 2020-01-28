import java.util.*;
  public class Q5 
  {
  public static void main(String[] args) 
  {
 
  List<String> list = new ArrayList<String>();
  list.add("Red");
  list.add("Green");
  list.add("Orange");
  list.add("White");
  list.add("Black");

  System.out.println(list);
 
  list.set(2, "Brown");


  System.out.println(list);
 }
}