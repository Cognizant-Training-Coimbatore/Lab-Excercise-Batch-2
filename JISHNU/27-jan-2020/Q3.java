package day5;



public class Q3 {

	static void validate()
	{
		String str;
		str="";
		if(str.length()!=0)
		{
		System.out.println(str.length());
		}
		else
		{
			throw new NullPointerException("String length zero");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		validate();
		}
		catch(Exception m) 
		{
			System.out.println("Exception occured: "+m);
		}
	}

}
