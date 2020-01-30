package Project1;

import java.util.TreeSet;

public class Q_no_14_28 {

	public static void main(String[] args) {
		TreeSet<Integer>list1=new TreeSet<Integer>();
		list1.add(10);
		list1.add(5);
		list1.add(15);
		list1.add(3);
		list1.add(12);
		System.out.println(list1);
		for(Integer s:list1)
		{
			if(s<7)
			System.out.println(s);
		}

	}

}
