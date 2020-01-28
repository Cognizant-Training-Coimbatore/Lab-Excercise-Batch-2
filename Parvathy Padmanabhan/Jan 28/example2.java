import java.util.*;
public class example2 {

	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<Integer>();
		int p=100;
		for(int i=0;i<4;i++)
		{
			list1.add(p);
			p+=100;
		}
		System.out.println(list1.contains(200));
	}

}
