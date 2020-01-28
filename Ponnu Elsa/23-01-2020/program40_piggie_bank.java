class AddAmount
{
int amt=1000;
AddAmount()
{
System.out.println("Final amount: "+amt);
}
AddAmount(int a)
{
amt=amt+a;
System.out.println("Final amount: "+amt);

}
}


public class program40_piggie_bank {

public static void main(String[] args) {
AddAmount obj1= new AddAmount();
AddAmount obj2=new AddAmount(100);
}

}
