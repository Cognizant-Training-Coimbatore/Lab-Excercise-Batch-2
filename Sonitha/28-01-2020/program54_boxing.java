//Boxing
public class program54_boxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int x =100;
   Integer obj ;
   obj = x;//integer value is converted into object
   System.out.println(obj.compareTo(100));
   //Unboxing-converting wrapper types to values of corresponding primitivee type
   int y = obj;
   System.out.println(y);
	}

}
