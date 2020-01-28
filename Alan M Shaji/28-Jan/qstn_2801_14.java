import java.util.Iterator;
import java.util.TreeSet;

public class qstn_2801_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> tree=new TreeSet<Integer>();
		tree.add(1);
		tree.add(2);
		tree.add(3);
		tree.add(43);
		tree.add(124);
		tree.add(23);
		tree.add(0);
		tree.add(43);

		for(Integer obj:tree)
		{
			if(obj<7)
				System.out.println(obj);
		}

	}

}
