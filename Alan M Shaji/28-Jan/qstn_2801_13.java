import java.util.TreeSet;

public class qstn_2801_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> tree=new TreeSet<Integer>();
		tree.add(1);
		tree.add(2);
		tree.add(3);
		tree.add(4);
		TreeSet<Integer> tree2=new TreeSet<Integer>();
	/*	tree2.addAll(tree);*/
		for(Integer obj:tree)
		{
			tree2.add(obj);
		}
		System.out.println(tree2);
		

	}

}
