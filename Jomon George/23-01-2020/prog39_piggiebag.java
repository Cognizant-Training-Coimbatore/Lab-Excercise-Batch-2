class piggie
{
	int amount=50;
	piggie()
	{
		System.out.println("$"+amount);
	}
	piggie(int x)
	{
		System.out.println("$"+(x+amount));
	}
}
public class prog39_piggiebag {
	

	public static void main(String[] args) 
	{
		piggie ob=new piggie();
		piggie ob1=new piggie(45);
	}
}
