package hello;
import java.util.*;
public class ques12 {
public static void main(String[] args) {
   
      HashSet<String> set = new HashSet<String>();
  
        set.add("Red");
        set.add("Green");
        set.add("Black");
        set.add("White");
        System.out.println("Frist HashSet content: "+set);
        HashSet<String>set2 = new HashSet<String>();
        set2.add("Red");
        set2.add("Pink");
        set2.add("Black");
        set2.add("Orange");
        System.out.println("Second HashSet content: "+set2);
        set.retainAll(set2);
        System.out.println("New HashSet content:");
        System.out.println(set);
   }
}
