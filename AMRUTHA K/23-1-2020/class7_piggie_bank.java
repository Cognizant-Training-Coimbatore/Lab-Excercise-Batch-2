package demo;
class addAmount{
	int amount=50;
	addAmount(){
		amount=50;
	}
	addAmount(int a){
		amount=amount+a;
		
	}
	void display()
	{System.out.println("final="+amount);
	
}}
public class class7_piggie_bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addAmount obj1=new addAmount();
		addAmount obj2=new addAmount(123);
		obj1.display();
		obj2.display();

	}

}
