package collections;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class pgmex20_less {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map1=new HashMap<Integer, String>();
		map1.put(1,"Abhijith");
		map1.put(2,"Stani");
		map1.put(3,"Irfan");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int i=0;
		Set<Integer> key=map1.keySet();
		for(int x:key)
		{
			if(x<=num)
			{
				System.out.println(map1.get(x));
			}
		}
	}

}
