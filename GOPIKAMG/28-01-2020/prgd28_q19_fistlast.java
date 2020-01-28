import java.util.TreeMap;

public class prgd28_q19_fistlast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,String> t1=new TreeMap<String,String>();
		t1.put("C1","blue");
		t1.put("C2","pink");
		t1.put("C3","violet");
		t1.put("C4","red");
		System.out.println("original contents "+t1);
		System.out.println("greatest key " +t1.firstKey());
		System.out.println("least key " +t1.lastKey());

	}

}
