import java.util.HashMap;

public class p101_retrive {

	public static void main(String[] args) {
		HashMap<Integer,String> obj=new HashMap<Integer,String>();
		obj.put(1,"one");
		obj.put(2,"two");
		obj.put(3,"three");
		obj.put(4,"four");
		System.out.println("The item from position 2 is:"+obj.get(2));

	}

}
