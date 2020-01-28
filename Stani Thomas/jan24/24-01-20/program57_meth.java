class par
{
	void display1()
	{
		System.out.println("This is parent class");
	}
	}
class chil extends par
{
	void display2() {
		System.out.println("This is child class");
	}
}
public class program57_meth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
par obj1=new par();
chil obj2=new chil();
obj1.display1();
obj2.display2();
obj2.display1();
	}

}
