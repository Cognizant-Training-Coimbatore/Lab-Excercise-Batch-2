import java.util.LinkedList;

public class question10 {

	public static void main(String[] args) {
		LinkedList<Integer>list=new LinkedList<Integer>();
		list.add(1);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(1);
		list.add(2);
		for(int i=0;i<6;i++)
		{
			int b=list.get(i);
			if(b==1)
			{
				System.out.println("fstb appeared at "+(i+1)+ "position");
				break;
				
			}
		}
		for(int i=5;i>=0;i--)
		{
			int b=list.get(i);
			if(b==1)
			{
				System.out.println("Last appered at "+(i+1)+"position");
				break;
			}
		}
		
		

	}

}
