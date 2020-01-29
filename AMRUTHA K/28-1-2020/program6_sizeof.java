package packagee;

import java.util.ArrayList;

public class program6_sizeof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String>list=new ArrayList<String>(2);
  list.add("amm");
  list.add("avg");
  list.add("ss");
  list.add("ahhh");
  list.ensureCapacity(4);
  
  System.out.println(list);
	}

}
