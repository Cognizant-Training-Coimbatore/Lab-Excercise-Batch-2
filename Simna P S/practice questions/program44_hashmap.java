import java.util.HashMap;

public class program44_hashmap 
{

	public static void main(String[] args) 
	{
		HashMap<Integer,String> map1 = new HashMap<Integer,String>();
		map1.put(1,"simna");
		map1.put(2,"sruthy");
		map1.put(3,"gayathri");
		map1.put(4,"megha");
		String empname = map1.get(2);
		System.out.println(empname);
		
		

	}

}
