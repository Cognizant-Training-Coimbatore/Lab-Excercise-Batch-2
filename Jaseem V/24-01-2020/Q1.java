class a{
	int x=10;
}
class b extends a{
	int y=10;
	void display() {
	System.out.println(x+y);
}}

public class Q1{
//qstn21 represent Inherit
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		b obj=new b();
		obj.display();

	}

}