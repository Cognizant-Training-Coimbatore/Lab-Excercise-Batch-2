import java.util.ArrayList;
import java.util.Iterator;


public class practice_Q2 
{

	public static void main(String[] args) 
	{
		
	    ArrayList arrayList = new ArrayList();
	   
	    
	    arrayList.add(100);
	    arrayList.add(200);
	    arrayList.add(300);
	    arrayList.add(400);
	    arrayList.add(500);
	   System.out.println(arrayList.contains(200));
	    
	    Iterator itr = arrayList.iterator();
	   
	    
	    System.out.println("Iterating through ArrayList elements...");
	    while(itr.hasNext())
	    {
	    	Object obj = itr.next();
	    
	      System.out.println(obj);
	    }
	}

}
