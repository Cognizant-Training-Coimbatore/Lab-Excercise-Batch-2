package day6;

import java.util.ArrayList;
import java.util.List;
public class Array_list_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1=new ArrayList<String>();
		list1.add("Jishnu");
		list1.add("Vishnu");
		list1.add("Abdu");
		list1.add("aghj");
		list1.add("yuj");
		System.out.println("An element at 2nd position :"+list1.get(2));
		for(String s:list1)
		{
			System.out.println(s);
		}
	}

}
