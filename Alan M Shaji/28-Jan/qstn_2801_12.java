import java.util.HashSet;
import java.util.Set;

public class qstn_2801_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set1= new HashSet<Integer>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		Set<Integer> set2= new HashSet<Integer>();
		set2.add(0);
		set2.add(2);
		set2.add(4);
		set2.add(6);
		Set<Integer> set1_Intersection_set2= new HashSet<Integer>();
		for(Integer i:set1)
			if(set2.contains(i))
				set1_Intersection_set2.add(i);
		System.out.println("Intersection of two sets");
		System.out.println(set1_Intersection_set2);

	}

}
