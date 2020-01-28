import java.util.HashMap;

public class p84_hashkey {

	public static void main(String[] args) {
		HashMap<Integer,String > m1=new HashMap<Integer, String>();
		m1.put(1,"udn");
		m1.put(2,"bzj");
		m1.put(3,"dcc");
		m1.put(4,"uin");
		m1.put(5,"uinxn");
		String empon=m1.get(2);
		System.out.println(empon);
		

	}

}
