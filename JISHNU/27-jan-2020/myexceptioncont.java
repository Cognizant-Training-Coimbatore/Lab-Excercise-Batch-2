package day5;

public class myexceptioncont {
	static void validate(int age)throws myexceptions
	{
		if(age<18)
		throw new myexceptions("not valid");
		else
			System.out.println("Welcome to vote");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			validate(14);
		}
		catch(Exception m) {
			System.out.println("Exception occured: "+m);
		}

	}

}
