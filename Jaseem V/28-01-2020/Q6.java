import java.util.ArrayList;
  public class Q6 {
  public static void main(String[] args) {
          ArrayList<String> a1= new ArrayList<String>();
          a1.add("jaseem");
          a1.add("amith");
          a1.add("Badeel");
          System.out.println("Initial array list: " + a1);
      
          a1.ensureCapacity(5);
          a1.add("Arhem");
          a1.add("Pinky");
         
          System.out.println("New array list: " + a1);
   }
}