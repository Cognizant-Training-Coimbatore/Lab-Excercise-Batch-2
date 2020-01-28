import java.util.ArrayList;
  public class Q8 {
    public static void main(String[] args) {
  ArrayList <String> c1 = new ArrayList <String> ();
  c1.add("India");
  c1.add("Germany");
  c1.add("Brazil");
  c1.add("italy");
  c1.add("Pakistan");
  System.out.println("\nOriginal array list: " + c1);
  System.out.println("\nPrint using index of an element: ");
  int no_of_elements = c1.size();
  for (int index = 0; index < no_of_elements; index++)
   System.out.println(c1.get(index));
 }
}