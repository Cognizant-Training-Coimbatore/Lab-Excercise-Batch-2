import java.util.Collections;
import java.util.LinkedList;

public class Qstion11 {

	public static void main(String[] args) 
	{
		LinkedList<String>list=new LinkedList<String>();
		list.add("ASA");
		list.add("BBA");
		list.add("AdA");
		list.add("CCA");
		list.add("AKA");
		System.out.println(list);
		Collections.swap(list, 0, 3);
		System.out.println(list);
	}

}
