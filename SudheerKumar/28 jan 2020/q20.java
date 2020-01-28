import java.util.TreeMap;
public class q20 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> map1=new TreeMap<Integer,String>(); 
		map1.put(10, "sudheer");
		map1.put(20, "ravi");
		map1.put(30, "rupesh");
		map1.put(40, "anwar");
		System.out.println(map1);
		System.out.println(map1.headMap(30));
}
}
