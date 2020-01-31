package javatest;

public class qstn7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Numbers divisble by 3...");
		for(int i=1;i<100;i++)
			if(i%3==0)
				System.out.print(i+"\t");
		System.out.println("\nNumbers divisble by 7...");
		for(int i=1;i<100;i++)
			if(i%7==0)
				System.out.print(i+"\t");
		System.out.println("\nNumbers divisble by 3 & 7...");
		for(int i=1;i<100;i++)
			if(i%3==0 && i%7==0)
				System.out.print(i+"\t");

	}

}
