import java.util.HashMap;

public class prog100_Hashmap 
{

	public static void main(String[] args)
	{
		HashMap<Integer,String> map1=new HashMap<Integer,String>();
		map1.put(1, "Betty");
		map1.put(2, "Blessy");
		map1.put(3, "Biniya");
		map1.put(4, "Ethan");
		String empname=map1.get(4);
		System.out.println(empname);
		
	}

}
