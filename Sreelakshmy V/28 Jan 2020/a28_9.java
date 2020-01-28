
		import java.util.LinkedList;
		import java.util.Iterator;
		public class a28_9 {
		   public static void main(String[] args) {
		      LinkedList<String> l = new LinkedList<String>();
		      l.add("John");
		      l.add("Sara");
		      l.add("Susan");
		      l.add("Betty");
		      l.add("Nathan");
		      System.out.println("The LinkedList elements are: ");
		      for (Iterator i = l.iterator(); i.hasNext();) {
		         System.out.println(i.next());
		      }
		   }
		}
	


