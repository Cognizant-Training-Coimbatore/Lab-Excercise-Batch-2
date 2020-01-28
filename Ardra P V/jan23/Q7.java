class bank{
	int x=50;
	void addAmount(){
		int a;
		a=x;
	}
	bank(){
		System.out.println("No amound is added to bank");
	}
	bank(int y){
		System.out.println("Added amount in bank is : " +(x+y));
	}
}
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       bank obj=new bank();
       bank obj2=new bank (10);
       obj.addAmount();
	}

}
