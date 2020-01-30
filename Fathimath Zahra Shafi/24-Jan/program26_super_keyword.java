class t1
{
	int x=90;
}

class t2 extends t1
{
	int x=70;
	void display()
	{
		System.out.println(super.x); //without super value will be 70
	}
}



public class program26_super_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		t2 obj1=new t2();
	obj1.display();

	}

}
