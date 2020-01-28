import java.util.TreeSet;

public class qtn13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> myset=new TreeSet<String>();
		   myset.add("ardra");
		   myset.add("anakha");
		   myset.add("anusha");
		   myset.add("ananya");
		   
		   
		   TreeSet<String> myset1=new TreeSet<String>();
		   myset1=(TreeSet<String>) myset.clone();
		   System.out.println(myset1);
		  

	}

}
