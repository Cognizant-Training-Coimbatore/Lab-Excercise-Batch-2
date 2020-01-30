package collections;

import java.util.ArrayList;
import java.util.List;

public class Pgm6_28_lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> al =new ArrayList<String>();
		al.add("Abhijith");
		al.add("Stani");
		al.add("Irfan");
		al.add(1,"Sachin");
		//System.out.println(al.get(2));
		for(String s:al)
		{
			System.out.println(s);
		}
	}

}
