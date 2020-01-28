import java.util.ArrayList;
import java.util.List;

public class P103_SIZEINCREASE {

	public static void main(String[] args) {
		ArrayList<String> map1=new ArrayList<String>(4);
		map1.add("one");
		map1.add("two");
		map1.add("three");
		map1.add("four");
		map1.ensureCapacity(6);
		map1.add("five");
		map1.add("six");
		System.out.println(map1);

	}

}
