import java.util.TreeSet;

public class qtn15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet <Integer>tree_num = new TreeSet<Integer>();
		   TreeSet <Integer>treeheadset = new TreeSet<Integer>();
		   tree_num.add(1);
		   tree_num.add(2);
		   tree_num.add(3);
		   tree_num.add(5);
		   tree_num.add(6);
		   tree_num.add(7);
		   tree_num.add(8);
		   tree_num.add(9);
		   tree_num.add(10);
		   
		   
		   System.out.println(tree_num.tailSet(7));

	}

}
