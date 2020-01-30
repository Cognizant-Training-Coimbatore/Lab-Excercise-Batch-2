package demo;

public class program47_parseInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=100;
		Integer obj = x; //auto boxing
		System.out.println(obj.compareTo(100));
		System.out.println(obj.compareTo(200));
		int y =obj; //unboxing
		System.out.println(y);
		System.out.println(Integer.parseInt("123") + 2);
	}

}
