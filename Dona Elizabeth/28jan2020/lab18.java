import java.util.HashMap;
import java.util.Set;

public class lab18 {

	public static void main(String[] args) {
		HashMap<Integer, String> map1=new HashMap<Integer, String>();
		map1.put(1,"Dona");
		map1.put(2,"Ponnu");
		map1.put(3,"Paru");
		String empname = map1.get(2);
		Set<Integer> key=map1.keySet();
		int min=99;
		int max=0;
		for(int x:key)
		{
			if(x<min)
			{
				min=x;
			}
			else if(x>max)
			{
				max=x;
			}
		}
		System.out.println(map1.get(min));
		System.out.println(map1.get(max));
	}

}
