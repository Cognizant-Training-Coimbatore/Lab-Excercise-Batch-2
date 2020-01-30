package jan29;

interface Myinterface
{
	void display1();
	
}
interface Myinterface1
{
	void display2();
	
}


class Question_3 implements Myinterface,Myinterface1 
{
	
	public void display1() {
		System.out.println("Myinterface implemented");
	}
	
	public void display2() {
		System.out.println("Myinterface1 implemented");
	}

	public static void main(String[] args) {

		Question_3 obj=new Question_3();
		obj.display1();
		obj.display2();
		

	}

}
