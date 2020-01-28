package package2;
class df
{
	void b() {
		System.out.println("this is a parent class");
	}
}
class fd extends df
{
	void c() {
		System.out.println("this is child class");
	}
}

public class qn_3_set3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
df obj=new df();
obj.b();
fd obj1=new fd();
obj1.c();
obj1.b();
	}

}
