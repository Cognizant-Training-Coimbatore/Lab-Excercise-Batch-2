import java.util.Iterator;
import java.util.LinkedList;


public class date28_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>myset=new LinkedList<String>();
		myset.add("stani");
		myset.add("jacky");
		myset.add("abhijith");
		myset.add("irfan");
		
		Iterator iterator1=myset.listIterator(1);
		while(iterator1.hasNext())
		{
			Object obj=iterator1.next();
			System.out.println(obj);
		}
	}

}
