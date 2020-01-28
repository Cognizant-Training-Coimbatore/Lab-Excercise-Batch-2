class k1
{
	int x=7;
}

class k2 extends k1
{
	int y=8;
	
}

class k3 extends k2
{
	int z=2;
	void display()
	{
	System.out.println(x+y+z);
	}
	
}


	


public class ex2_q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		k3 obj=new k3();
		obj.display();


	}

}
