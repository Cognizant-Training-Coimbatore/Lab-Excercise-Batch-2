import java.util.ArrayList;

public class pro_11111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("Amit");
		arr.add("Vijay");
		arr.add("Binoy");
		arr.add("Adhil");
		System.out.println(arr);
		arr.set(1,"Jino");
		System.out.println(arr.get(1));
		System.out.println("After updation : "+arr);

	}

}
