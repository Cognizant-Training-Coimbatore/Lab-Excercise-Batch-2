package set_6;

import java.util.ArrayList;
import java.util.List;

public class qn_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>list=new ArrayList<String>(3);
		list.add("ammu");
		list.add("anu");
		list.add("aruvi");
		
		System.out.println("old list" +list);
		list.ensureCapacity(6);
		list.add("ayan");
		list.add("aan");
		list.add("ron");
		
		System.out.println("new list: " +list);
	}

}
