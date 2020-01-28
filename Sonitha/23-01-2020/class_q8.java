class Programming
{
	
	void string(String s){
		if(s==null)
		System.out.println("I love programming language.");
		else 
		System.out.println("I love "+ s);
	}
}
public class class_q8 {

	public static void main(String[] args) 
	{
	  Programming ob = new Programming();
	  String s = "strings";
	  ob.string(null);
       ob.string(s);
	}

}
