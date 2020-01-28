class Stud
{
	int a;String b;
	String s;
void assign(int x, String y, String z)
{
	 a=x;
	 b= y;
	 s= z;
	
}
void display()
{
	System.out.println("Roll no=" +a);
	System.out.println("Phon no=" +b);
	System.out.println("Address=" + s);
}
}
public class a2_ {

	public static void main(String[] args) {
		Stud ob=new Stud();
		ob.assign(1,"9845741244","hhsjuhhjhijsjw");
		System.out.println("Sam");
		ob.display();
		Stud ob1=new Stud();
		ob1.assign(2,"9876542086","nircekhcnkdjw");
		System.out.println("John");
		ob1.display();
	}

}
