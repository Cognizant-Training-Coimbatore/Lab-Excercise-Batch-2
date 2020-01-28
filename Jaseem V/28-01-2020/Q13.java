import java.util.TreeSet;
public class Q13
{
  public static void main(String[] args)
  {
  TreeSet<String> Set1 = new TreeSet<String>();
  
  Set1.add("Yellow");
  Set1.add("Green");
  Set1.add("Blue");
  
  System.out.println("First set: "+Set1);
  TreeSet<String> Set2 = new TreeSet<String>();
  Set2.add("Pink");
  Set2.add("White");
  Set2.add("Black");
  System.out.println("Second set: "+Set2);
   
   Set1.addAll(Set2);
   System.out.println("New Set: "+Set1);
 }
}