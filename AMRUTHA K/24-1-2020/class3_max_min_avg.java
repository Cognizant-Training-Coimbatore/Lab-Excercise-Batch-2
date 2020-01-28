package demo11;

import java.util.Scanner;

class m{
	int x=0,y=0,z;
	void input() {
		System.out.println("enter nos");
		for(int i=0;i<10;i++) {
			
			Scanner a=new Scanner(System.in);
			int b=a.nextInt();
			if(y<b) {
			
				y=b;
			}
			else {
			
				z=b;
				
				
			}
			
			x=x+b;}
		float v=(float)x/10;
			System.out.println("average="+v);
			 
				
			
		
		System.out.println("max="+y+"  min"+z);
	}
}
public class class3_max_min_avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m obj=new m();
		obj.input();
		

	}

}
