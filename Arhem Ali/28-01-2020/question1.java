import java.util.ArrayList;

public class question1 {
	static void printarraylist(ArrayList list1)
	{
		for(Object obj:list1)
		{
			System.out.println(obj);
		}
	}	

	public static void main(String[] args) {
		
		ArrayList mylist=new ArrayList();
		mylist.add("red");
		mylist.add("blue");
		mylist.add("green");
		printarraylist(mylist);
		
	}

}
