class a1{
	int x=10;
}
class a2 extends a1{
	int x=100;
	void display() {
		System.out.println(super.x);
	}
}
public class program33_super_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       a2 bla =new a2();
       bla.display();
	}

}
