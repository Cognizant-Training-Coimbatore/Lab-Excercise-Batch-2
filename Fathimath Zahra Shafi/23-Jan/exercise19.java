class addamount {
	int amount=50;
	
	addamount(){
		System.out.println("final amount : 50");
		
	}
	
	addamount(int x)
	{
		amount=amount+x;
		System.out.println("final amount: " +amount);
	}
}
public class exercise19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		addamount obj=new addamount();
		addamount obj1 = new addamount(500);
	}

}
