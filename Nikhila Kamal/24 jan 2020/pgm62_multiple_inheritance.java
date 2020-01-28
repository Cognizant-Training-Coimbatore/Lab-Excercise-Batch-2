class n
{
	
	void display()
	{
		System.out.println("nikhila");
	}
}
	
class m extends n
{
	void display()
	{
		System.out.println("kamal");
	}
}
class k extends n,m
{

	public static void main(String[] args) {
		
		k obj=new k();
		obj.display();
	}

}

