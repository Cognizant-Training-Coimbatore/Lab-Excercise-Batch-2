import java.util.LinkedList;

public class First_last_linkedlist {

	public static void main(String[] args)
	{
		LinkedList<String> ob=new LinkedList<String>();
		
		ob.add("yellow");
		ob.add("blue");
		ob.add("white");
		ob.add("yellow");
		ob.add("pink");
		System.out.println("The list is:"+ob);
		System.out.println("The first occurence of yellow is:"+ob.indexOf("yellow"));
		System.out.println("The last occurence of yellow  is:"+ob.lastIndexOf("yellow"));
		
		
	}

}
