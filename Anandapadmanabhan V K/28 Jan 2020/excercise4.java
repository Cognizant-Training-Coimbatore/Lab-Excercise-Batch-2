import java.util.HashMap;

public class excercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			HashMap<Integer,String> map1=new HashMap<Integer,String>();
			map1.put(1, "anandu");
			map1.put(2,"shahin");
			map1.put(3, "jim");
			map1.put(4, "kane");
			String empname=map1.get(2);
			System.out.println("The second element is " +empname);
	}

}