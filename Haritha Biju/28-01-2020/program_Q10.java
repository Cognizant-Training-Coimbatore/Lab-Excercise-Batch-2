import java.util.ArrayList;







// doubt- wrong program









//Write a Java program to get the first and last occurrence of the
//specified elements in a linked list.  
public class program_Q10
{

	public static void main(String[] args) 
	{
		ArrayList <String>  mylist=new ArrayList<String>();
		mylist.add("Item1");
		mylist.add("Item2");
		mylist.add("Item1");
		mylist.add("Item4");
		mylist.add("Item1");
		System.out.println("The list:"+mylist);
		Object search="Item1";
		int last=0,first=0;
		first=mylist.indexOf(mylist.getFirst("Item1"));
		for(Object x : mylist)
		{	if(x==search)
			{	 System.out.println(x);
				first= mylist.indexOf();
				 last = mylist.indexOf(x);
			}
		}
		
	    System.out.println("First Occurance of Element Item1 is: "+first+1); 
	    
	  
		System.out.println("Last Element is: "+last+1);

	}

}
