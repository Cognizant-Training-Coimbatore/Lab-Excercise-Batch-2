class javaclassA{
void display()
{
	System.out.println("JavaclassA is running");
}
}
class javaclassB extends javaclassA{
	void display()
	{
		System.out.println("Javaclass B is running");
	}
}

public class PROGRAM36_METHODoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       javaclassB obj = new javaclassB();
       obj.display();//it displays javaclass B
	}

}
