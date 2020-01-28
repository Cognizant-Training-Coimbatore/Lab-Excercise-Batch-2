
import java.util.*;
import java.util.Map.Entry;  
public class program111q18 {  
     public static void main(String args[]) {
  TreeMap < Integer, String > tree_map1 = new TreeMap < Integer, String > ();
  tree_map1.put(10, "Red");
  tree_map1.put(20, "Green");
  tree_map1.put(40, "Black");
  tree_map1.put(50, "White");
  tree_map1.put(60, "Pink");
 System.out.println("Orginal TreeMap content: " + tree_map1);
  System.out.println("Checking the entry for least key: ");
  System.out.println("Value is: " + tree_map1.floorEntry(10));
  System.out.println("Checking the entry for greatest key: ");
  System.out.println("Value is: " + tree_map1.floorEntry(60));
 }
}