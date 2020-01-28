class Str
{
	int length;
	String name,newname;
	public void Lower(String st)
	{
		name=st;
		newname=name.toLowerCase();
		System.out.println("The new string is.."+newname);
		}
	public void StrLen(String st)
	{
		name=st;
		length=name.length();
		System.out.println("Length of string is.."+length);
		}
	
}
public class program41_Question5 {

	public static void main(String[] args) {
	Str s=new Str();
	s.Lower("PARVATI");
	s.StrLen("parvati");

	}

}
