import java.util.*;
public class example5hasmap {

	public static void main(String[] args) {
		HashMap<Integer,String> myset = new HashMap<Integer,String>();
		myset.put(1,"Parvathy");
		myset.put(2,"Padmanabhan");
		myset.put(3,"Rema");
		myset.put(4,"Devika");
		myset.put(5,"Parvathy");
		myset.put(6,"Parvathy");
		System.out.println(myset);
		String name= myset.get(2);
		System.out.println(name);
	}

}
