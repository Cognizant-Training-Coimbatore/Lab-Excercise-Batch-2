package demo;
class parameter{
	void sample(int a,char b) {
		System.out.println("integer="+a+"   character="+b);
	}
	void sample(char b,int a) {
		System.out.println("character="+b+"  integer="+a);
	}
}
public class class9_parameter_sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parameter obj=new parameter();
		obj.sample('a', 2);
		obj.sample(8, 'r');


	}

}
