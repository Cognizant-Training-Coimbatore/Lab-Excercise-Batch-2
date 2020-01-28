class abc{
	
	void display() 
	{
		System.out.println("This is parent class");
	}}
class chi extends abc{
void dis() {
System.out.println("This is child class");
}
}
public class Qno_3 {

public static void main(String[] args) 
{
abc obj1=new abc(); 
chi obj=new chi();
obj1.display();
obj.dis();
obj.display();
}

}