package project1;
interface test
{
	void square();
  }
class arithmetic implements test
{
        int length=10;
	@Override
	public void square() {
		// TODO Auto-generated method stub
		double area=length*length;
		System.out.println("area is "+area);
	}
class totestint 
	{
		arithmetic a=new arithmetic();
		totestint()
		{ a.square();}
	}
	   
    
public class ex7_Q4 {

	public Static void main(String[] args) {
		// TODO Auto-generated method stub
		
		totestint  t=new totestint();

	}

}
}
