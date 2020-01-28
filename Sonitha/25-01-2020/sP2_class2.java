package samplePackage2;

import java.util.Scanner;

class a32{
	int x=100;
	
}
class a33 extends a32{
	void display()
	{
		System.out.println("class a33 extends a32 and the value from a32 is : "+x);
		
	}
}
public class sP2_class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Class 2 is running..");
      a33 ob = new a33();
      void display1() {
      ob.display();
	}}

}
