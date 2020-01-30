package collections;

import java.util.HashMap;
import java.util.Set;

public class pgmex18_leastndgreat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map1=new HashMap<Integer, String>();
		map1.put(1,"Abhijith");
		map1.put(2,"Stani");
		map1.put(3,"Irfan");
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
