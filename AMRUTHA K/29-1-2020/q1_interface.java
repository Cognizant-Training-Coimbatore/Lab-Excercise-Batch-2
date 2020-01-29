package package1;
interface print{
	int a=0;
	void display();
	
	
}

class rectangle implements print{
	public void display() {
		System.out.println(a);
	}
}
class SpotCar implements print{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("classs spotcar running...");
	}
	
	
}
class Manager implements print{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("class manager running...");
	}
	
}
public class q1_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager ob= new Manager();
		SpotCar ob1=new SpotCar();
		rectangle ob2=new rectangle();
		ob.display();
		ob1.display();
		ob2.display();

	}

}
