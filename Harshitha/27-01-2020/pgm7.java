
public class pgm7 {
static void validate(int age)throws myexceptions
{
	if(age<18)
		throw new myexceptions("not valid");
	else
		System.out.println("Welcome to vote");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	validate(13);
	}
catch(Exception e) {
	System.out.println("Exception occured"+e);
	}
	}	
}


