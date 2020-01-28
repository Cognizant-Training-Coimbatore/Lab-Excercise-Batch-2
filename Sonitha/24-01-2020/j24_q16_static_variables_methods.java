class stat{
	int a;
	static int b;
	static  void display() {
		
		b++;
		
		System.out.println("The static variable b="+ b);
	 }
    void display2() {
    	
	a++;
	System.out.println("The variable a ="+a);
	}
}
public class j24_q16_static_variables_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   stat ob1 =new stat();
   stat ob2 =new stat();
   ob1.display();
   ob2.display();
   ob1.display2();
   ob2.display2();
	}

}
