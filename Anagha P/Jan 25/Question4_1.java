package pack1;

public class Question4_1 {
	//protected class emp
	//{
    protected	String nam[]= {"john","sam","anu","jaime","saran"};
	protected	String ad[]= {"sahayy,kottayam,kerala","sarara,kottayam,kerala","ththth,coimbathore","gdgfghfhf,gyh,juhj","gfgfgff,fgfgf,bbbbbb"};
	protected	String dep[]= {"cs","eee","ece","mech","it"};
	protected int salary[]= {50000,50000,40000,35000,65000};
		
		
	protected	int i;
	protected	void display()
		{
			for(i=0;i<5;i++)
			{
				System.out.println("\n");
				System.out.println("employee"+i+"detail");
				System.out.println("NAME:"+nam[i]);
				System.out.println("adress:"+ad[i]);
				System.out.println("department is:"+dep[i]);
			}
		}
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String name[]=new String[10];

	}

}
