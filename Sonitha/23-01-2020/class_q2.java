
class learn
{
	String name;
	long ph_no;
	int roll_no;
	String adre;
	
	public void assign(String n,long p,int r,String a)
	{
		name = n;
		roll_no = r;
		adre =a;
		ph_no =p;
	}
	 void display()
	{
		System.out.println(name);
		System.out.println(roll_no);
		System.out.println(ph_no);
		System.out.println(adre);
	}
}
public class class_q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 learn obj =new learn();
		 obj.assign("Sam", 124235, 1, "adresse");
	     System.out.println("The details of sam are :");
	     obj.display();
	     learn obj1 =new learn();
		 obj1.assign("John", 1242351, 10, "adresse1");
	     System.out.println("The details of John are :");
	     obj1.display();
	
	}

}
