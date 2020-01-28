class x{
	void msg() {
		System.out.println("Hello");
	}}
class y{
		void msg() {
			System.out.println("Welcome");
		}}
class z extends x,y{
	void msg() {
		System.out.println("hai");
	}
}	
	

public class qtn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       z obj=new z();
       obj.msg();
	}

}
