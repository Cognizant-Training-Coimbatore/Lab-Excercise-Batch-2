
public class program31_exception {

	public static void main(String[] args) {
		try
		{
			int a=10,b=5,c=5;
			int result;
			result=a/(b-c);
		}
	catch(Exception e) {
		System.out.println("error in code:"+e);
	}
System.out.println("out of block");
	}

}
