import java.util.TreeSet;
   public class ex13 
   {
	  public static void main(String[] args) {
	  TreeSet<String> tree_set1 = new TreeSet<String>();
	  tree_set1.add("White");
	  tree_set1.add("Black");
	  tree_set1.add("Red");
	  System.out.println("Tree set1: "+tree_set1);
	  TreeSet<String> tree_set2 = new TreeSet<String>();
	  tree_set2.add("Red");
	  tree_set2.add("Orange");
	  tree_set2.add("White");
	  System.out.println("Tree set2: "+tree_set2);
	  tree_set1.addAll(tree_set2);
	  System.out.println("Tree set1: "+tree_set1);
   }

}