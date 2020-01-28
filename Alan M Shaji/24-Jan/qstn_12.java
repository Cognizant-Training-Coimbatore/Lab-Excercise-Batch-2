interface Car
{
	void accelerate();
	void horn();
}
class Maruti implements Car
{
	public void accelerate()
	{
		System.out.println("vrrroooommmmm");
	}
	public void horn()
	{
		System.out.println("peeepppee");
	}
}
class Hyundai implements Car
{
	public void accelerate()
	{
		System.out.println("vrrroooommmmm vrrrooom");
	}
	public void horn()
	{
		System.out.println("pppo pppoooo");
	}
}
public class qstn_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("multiple inheritance is not possible in java. But you have Interface!");
		System.out.println("HYUNDAI");
		Hyundai obj =new Hyundai();
		obj.accelerate();
		obj.horn();
		Maruti obj1=new Maruti();
		System.out.println("MARUTI");
		obj1.accelerate();
		obj1.horn();
	}

}
