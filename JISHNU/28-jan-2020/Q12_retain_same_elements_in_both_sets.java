package day6;

import java.util.HashSet;
import java.util.Set;

public class Q12_retain_same_elements_in_both_sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer>list1=new HashSet<Integer>();
		list1.add(100);
		list1.add(200);
		list1.add(300);
		list1.add(400);
		System.out.println(list1);
		Set<Integer>list2=new HashSet<Integer>();
		list2.add(100);
		list2.add(200);
		list2.add(500);
		list2.add(400);
		System.out.println(list2);
		list1.retainAll(list2);
		System.out.println("After retaining");
		System.out.println(list1);
		
		
	}

}
