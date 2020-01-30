class stringhandler
{
	void len(String str)
	{
		int a =str.length();
		System.out.println("The length of string is "+a);
		System.out.println(str.toLowerCase());
	}
	
}
public class Program41 {

	public static void main(String[] args) {
		stringhandler obj = new stringhandler();
		obj.len("Diya");
		

	}

}
