
public class program46_myexceptions {

	static void validate(int age)throws myexceptions{
		if(age<10)
			throw new myexceptions("int Invalid");
		else
			System.out.println("welcome to vote");
	}
	public static void main(String[] args) {
	try {
		validate(13);
		validate(3);
	}catch (Exception e)
	{
		System.out.println("Exception ocurred :"+ e);
	}
	}

}
