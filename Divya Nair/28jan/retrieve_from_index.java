import java.util.HashMap;

public class retrieve_from_index {

	public static void main(String[] args)
	{
		HashMap<Integer,String> obj=new HashMap<Integer,String>();
		obj.put(1,"Bread");
		obj.put(2,"jam");
		obj.put(3,"Butter");
		obj.put(4,"cake");
		System.out.println("The item from position 2 is:"+obj.get(2));
		
	}

}
