package java50;

public class qu10_arraymultiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,3,5};   
		int b[]={1,1,1};
		String res="";
		
		    for(int i=0;i<a.length;i++)
		    { 
		    int x=a[i];
		    int y=b[i];
		 
		     res=res+Integer.toString(x*y);
		    
		    }
		System.out.print(res);   
		}  
		   
		} 
	


