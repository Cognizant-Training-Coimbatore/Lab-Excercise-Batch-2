import java.util.Iterator;
import java.util.TreeSet;

public class qtn14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet <Integer>tree_num = new TreeSet<Integer>();
		   TreeSet <Integer>treeheadset = new TreeSet<Integer>();
		   tree_num.add(10);
		   tree_num.add(2);
		   tree_num.add(8);
		   tree_num.add(5);
		   tree_num.add(6);
		   tree_num.add(7);
		   tree_num.add(5);
		   tree_num.add(9);
		   tree_num.add(1);
		   treeheadset = (TreeSet)tree_num.headSet(7);  

		   // create an iterator
		   Iterator iterator;
		   iterator = treeheadset.iterator();
		     
		   //Displaying the tree set data
		   System.out.println("Tree set data: ");     
		   while (iterator.hasNext()){
		   System.out.println(iterator.next() + " ");
		   

	}

}
}
