import java.util.ArrayList;

public class prgm_forloop_other_method {

	
		Static void printArray(int myarray[])
		{
			for(int x:myarray)
			{
				System.out.println(x);
				
			}
		}
		Static void printArrayList(ArrayList list1)
		{
			System.out.println(obj);
			
		}
		// TODO Auto-generated method stub

	}
	public static void main(String[] args)
	{
		int no[]=new int[3];
		no[0]=10;
		no[1]=2;
		no[2]=3;
		printArray(no);
		ArrayList mylist=new ArrayList();
		mylist.add("item1");
		mylist.add("item2");
		
		mylist.add("item3");
		printArrayList(mylist);
		
		
		
	}

}
