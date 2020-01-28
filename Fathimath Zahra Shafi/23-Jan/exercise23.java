class stringhandler
{
	String str;
	int length;
	void count(String str)
	{
		System.out.println("no. of characters in string: " +str.length());
	}
	
	void lower(String str)
	{
		System.out.println(str.toLowerCase());
	}
}
public class exercise23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringhandler obj=new stringhandler();
		obj.count("dictionary");
		obj.lower("DiCtionAry");
	}

}
