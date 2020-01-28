import java.util.TreeSet;

public class j28_q13_addTreeSetToAnotherTreeSet {

	public static void main(String[] args) {
		TreeSet<String> myset = new TreeSet<String>();
		myset.add("Item1");
		myset.add("Item2");
		myset.add("Item3");
		myset.add("Item4");
		myset.add("Item5");
		myset.add("Item6");
		System.out.println("the elements in first set is : "+myset);
		TreeSet<String> set = new TreeSet<String>();
		set.add("Item11");
		set.add("Item21");
		set.add("Item31");
		set.add("Item41");
		set.add("Item51");
		set.add("Item61");
		System.out.println("the elements in second set is :"+ set);
		myset.addAll(set);
		System.out.println("After adding the set 2 in set1 : "+myset);
		

	}

}
