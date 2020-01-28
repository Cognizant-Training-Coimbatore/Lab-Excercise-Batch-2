import java.util.*;
  public class Q12 {
  public static void main(String[] args) {
     
        HashSet<String> Set1 = new HashSet<String>();
   
          Set1.add("Red");
          Set1.add("Green");
          Set1.add("Blue");
          Set1.add("White");
          System.out.println("First Set content: "+Set1);
          HashSet<String>Set2 = new HashSet<String>();
          Set2.add("Red");
          Set2.add("Pink");
          Set2.add("Blue");
          Set2.add("Orange");
          System.out.println("Second Set content: "+Set2);
          
          Set1.retainAll(Set2);
          System.out.println("Elements in both sets :");
          System.out.println(Set1);
     }
}