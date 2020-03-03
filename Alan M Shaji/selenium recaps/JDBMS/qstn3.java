package apache;
interface father
{
	public void XY();
}
interface mother
{
	public void XX();
}
class Child implements father, mother
{
	public void XX()
	{
		System.out.println("Mother's XX");
	}
	public void XY()
	{
		System.out.println("Father's XY");
	}
}public class qstn3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj=new Child();
		obj.XY();
		obj.XX();
		
	}

}