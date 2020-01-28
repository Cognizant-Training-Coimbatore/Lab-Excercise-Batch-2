import java.util.ArrayList;
import java.util.List;

public class p83_methods_introduce 
{

	public static void main(String[] args) 
	{
	List<String> m=new ArrayList<String>();
	m.add("item1");
	m.add("item2");
	m.add("item3");
	m.add("item4");
	m.add("item5");
	System.out.println("total items="+m.size());
	System.out.println("testinf item4 exist...."+m.contains("item4"));
	System.out.println("printing all items..."+m);
	System.out.println("remove ithem3.....");
	m.remove("item3");
	System.out.println("Printing all ite,s after remove......");
	System.out.println("printing all items..."+m);
	
	

	}

}
