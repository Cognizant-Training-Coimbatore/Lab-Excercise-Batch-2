
public class program84_boxing {

	public static void main(String[] args) {

	int x=100;
	Integer obj;//Integer is a collection to store some integer value
	obj=x;
	System.out.println(obj.compareTo(100));//since the number is same it will return 0 , else will return -1
	
	int y=obj;
	System.out.println(y);
	}

}
