package package3;
class javaa
{
void display() {
	System.out.println("java a  is running");
}

}
class javab extends javaa
{
	void display() {
		System.out.println("java b is running");
	}
}
public class overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
javab obj=new javab();
obj.display();
	}

}
