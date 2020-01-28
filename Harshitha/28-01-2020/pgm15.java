import java.util.HashSet;
import java.util.Set;

public class pgm15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Set<Integer> myset=new HashSet<>();
     myset.add(1);
     myset.add(1);
     myset.add(2);
     myset.add(9);
     System.out.println(myset);
     for(int i:myset)
    	 System.out.println(i);
	}

}
