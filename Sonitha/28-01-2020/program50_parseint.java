
public class program50_parseint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x =100;
		   Integer obj ;
		   obj = x;//integer value is converted into integer object
		   System.out.println(obj.compareTo(200));
		   System.out.println(obj.compareTo(100));
		   //Unboxing-converting wrapper types to values of corresponding primitive type
		   //store the integer objt to the integer variable
		   int y = obj;
		   System.out.println(y);
		   System.out.println(Integer.parseInt("123")+2);
	}

}
