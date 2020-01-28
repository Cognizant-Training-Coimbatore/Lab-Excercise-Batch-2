package pgm_excercises_28_jan;

import java.util.ArrayList;
import java.util.List;

public class pgm_8 {

	public static void main(String[] args) {
		List<String> mylist=new ArrayList<String>();
		mylist.add("nikhila");
		mylist.add("kamal");
		mylist.add("java");
		//System.out.println("list: " + mylist);
		for(int i=0;i<mylist.size();i++)
		{
			System.out.println(mylist.get(i));
		}

	}

}
