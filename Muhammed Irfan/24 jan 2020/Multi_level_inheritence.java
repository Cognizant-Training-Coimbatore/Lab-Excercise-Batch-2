package demo;
class t1
{
int x=5;	
}

class t2 extends t1
{
int y=5;	
}
class t3 extends t2
{
int z=5;

void display()
{
	System.out.println(x+y+z);
	}
}
public class Multi_level_inheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		t3 obj=new t3();
		obj.display();
		
	}

}
