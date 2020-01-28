import java.util.ArrayList;
import java.util.Iterator;

public class jan28_q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ArrayList<String> list1=new ArrayList<String>();
		list1.add("blue");
		list1.add("red");
		list1.add("black");
		list1.add("orange");
		Iterator itr=list1.iterator();
				while(itr.hasNext())
				{
					Object obj=itr.next();
					System.out.println(obj);
				}
		
		
		
		
	}

}
