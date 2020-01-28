import java.util.ArrayList;

public class question6 {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(1);
		a1.add(2);
		System.out.println("Size: "+a1.size());
		a1.ensureCapacity(15);

	}

}
