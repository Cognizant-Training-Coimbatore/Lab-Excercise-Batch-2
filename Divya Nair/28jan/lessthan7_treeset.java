import java.util.Iterator;
import java.util.TreeSet;

public class lessthan7_treeset {

	public static void main(String[] args) {
		TreeSet<Integer> hsh1=new TreeSet<Integer>();
		TreeSet <Integer>treeheadset = new TreeSet<Integer>();
		hsh1.add(1);
		hsh1.add(2);
		hsh1.add(8);
		hsh1.add(6);
		hsh1.add(10);
		System.out.println("The first set of elements are:"+hsh1);
		treeheadset=(TreeSet)hsh1.headSet(7);
		Iterator iterator1=treeheadset.iterator();
		System.out.println("All elements are:");
		System.out.println("The numbers less that 7:");
		while(iterator1.hasNext())
		{
			System.out.println(iterator1.next() + " ");
		}


	}

}
