package packagee;

import java.util.HashSet;
import java.util.Set;

public class program12_compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> myset=new HashSet<Integer>();//array will dispaly as un ordered
		//also there is no repitition for array elaments.
			myset.add(1);
			myset.add(2);
			myset.add(4);
			myset.add(3);
			System.out.println(myset);
			
			Set<Integer> myset2=new HashSet<Integer>();//array will dispaly as un ordered
			//also there is no repitition for array elaments.
				myset2.add(1);
				myset2.add(0);
				myset2.add(7);
				myset2.add(6);
				System.out.println(myset2);
				myset.retainAll(myset2);//to make intersected elements in the 2 hashsets
				System.out.println(myset);
		

	}

}
