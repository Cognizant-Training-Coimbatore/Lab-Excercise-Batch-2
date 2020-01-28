package package2;
class a1
{
	int a=2;
	
}
class a2 extends a1
{
	int b=5;
}
class a3 extends a2
{
	int c = a+b;

void display() {
	System.out.println(c);
}
}




public class mul_inherit {

	public static void main(String[] args) {
		a3 obj=new a3();
		obj.display();
			}
		// TODO Auto-generated method stub

	}


