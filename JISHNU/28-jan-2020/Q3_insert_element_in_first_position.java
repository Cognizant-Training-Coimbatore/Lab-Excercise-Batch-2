package day6;

import java.util.ArrayList;

public class Q3_insert_element_in_first_position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1=new ArrayList<Integer>();

		list1.add(25);
		list1.add(30);
		list1.add(35);
		list1.add(40);
		list1.add(45);
		list1.add(0,10);//add element 10 in the first position
	
		for(Integer s:list1)
		{
			System.out.println(s);
		}
		
	}

}
