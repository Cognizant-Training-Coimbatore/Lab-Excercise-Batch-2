package day6;

import java.util.ArrayList;

public class Q6_increase_size_of_array_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1=new ArrayList<String>(5);
		list1.add("Red");
		list1.add("Yellow");
		list1.add("Green");
		list1.add("Violet");
		list1.add("Orange");
		list1.ensureCapacity(10);//increase ArrayList size
		list1.add("Blue");
		System.out.println("List "+list1);
		
	}

}
