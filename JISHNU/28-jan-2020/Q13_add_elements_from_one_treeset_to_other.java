package day6;

import java.util.TreeSet;

public class Q13_add_elements_from_one_treeset_to_other {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> set1=new TreeSet<String>();
		set1.add("Jishnu");
		set1.add("Vishnu");
		set1.add("Vishu");
		set1.add("Onam");
		TreeSet<String> set2=new TreeSet<String>();
		set2.add("Kerala");
		set2.add("Kannur");
		set2.add("Malabar");
		set2.add("India");
		set1.addAll(set2);
		System.out.println(set1);
		
	}

}
