import java.util.Set;
import java.util.TreeSet;

public class question14_number_less_7 {

	public static void main(String[] args) {
		Set<Integer> b1=new TreeSet<Integer>();
		Set<Integer> b2=new TreeSet<Integer>();
		b1.add(1);
		b1.add(2);
		b1.add(3);
		b1.add(4);
		b1.add(5);
		b1.add(6);
		b1.add(7);
		b1.add(8);
		b1.add(9);
		b1.add(10);
		b1.add(11);
		b1.add(12);
		b1.add(13);
		b1.add(14);
		b1.add(15);
		b1.add(16);
		
		b2.add(1);
		b2.add(2);
		b2.add(3);
		b2.add(4);
		b2.add(5);
		b2.add(6);
		b2.add(7);
		System.out.println("Elements of set "+b1);
		b1.retainAll(b2);
		System.out.println("The elements less than 7 are "+b1);
		
		
		
	}
	}



