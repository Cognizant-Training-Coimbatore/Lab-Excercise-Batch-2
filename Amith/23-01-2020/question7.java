class addamount
{
	int amnt=50;
	addamount()
	{
		System.out.println("final amount is "+amnt);
	}
	addamount(int a)
	{
		amnt=amnt+a;
		System.out.println("final amount is "+amnt);
		
	}
}
public class question7 {

	public static void main(String[] args) 
	{
	addamount obj1= new addamount();
	addamount obj2=new addamount(100);

	}

}
