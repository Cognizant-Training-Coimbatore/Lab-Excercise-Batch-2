import java.util.*;
  public class Q3 
  {
  public static void main(String[] args) 
  {
 
  List<String> list = new ArrayList<String>();
  list.add("Car");
  list.add("Bus");
  list.add("Lorry");
  list.add("Jeap");
  list.add("Train");

  System.out.println(list);
 
  list.add(0, "Bike");


  System.out.println(list);
 }
}