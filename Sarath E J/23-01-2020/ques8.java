
class Programmming
{
	String s="I love ";
	Programmming()
	{
		s+="Programming language";
		System.out.println(s);
	}
	Programmming(String str)
	{
		s+=str;
		System.out.println(s);
	}
}
public class prog35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programmming obj1= new Programmming();
		Programmming obj2= new Programmming("java");

	}

}
