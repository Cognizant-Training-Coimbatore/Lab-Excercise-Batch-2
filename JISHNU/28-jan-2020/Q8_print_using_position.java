package day6;

import java.util.ArrayList;

public class Q8_print_using_position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list2=new ArrayList<Integer>();

		list2.add(25);
		list2.add(30);
		list2.add(35);
		list2.add(40);
		list2.add(45);
		int size=list2.size();
		for(int i=0;i<size;i++)
			System.out.println(list2.get(i));
	}

}
