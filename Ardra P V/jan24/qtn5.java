class shape{
	void bla() {
		System.out.println("This is shape");
	}}
	class rectangle extends shape{
		void x() {
			System.out.println("This is rectangle");
		}
	}
	class circle extends shape{
		void y() {
			System.out.println("this is circle");
		}}
		class square  extends rectangle {
			void z() {
				System.out.println("Square is a rectangle");
			}
		}
	


public class qtn5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		square sq=new square();
		sq.bla();
		sq.x();

	}

}
