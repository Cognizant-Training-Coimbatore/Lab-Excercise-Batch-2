
public class p83_intconvertion {

	public static void main(String[] args) {
		int x=100;
		Integer ob=x;//unboxing......object<variable
		System.out.println(ob.compareTo(200));
		System.out.println(ob.compareTo(100));
		int y=ob;//boxing....object>varisble
		System.out.println(Integer.parseInt("123")+2);
	}

}
