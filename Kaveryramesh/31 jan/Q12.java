package practical_excercise;

class tree
{ 
	int data;
	tree left,right;
	  public tree(int item)
	   {   
		  data=item;
		   left=null;
		   right=null;
		   
	   }  }
	   
class binarytree
{    
	 tree root;
	   binarytree()
	   {
		   root=null;
	   }	
    
	   void preorder(tree root)
	   {   
		   if(root!=null)
		   
		   {  
			System.out.println(root.data);
		   preorder(root.left);
		   preorder(root.right);
		   }
		   
		   
	   }
	
   }


public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binarytree t=new binarytree();
		t.root=new tree(10);
		t.root.left=new tree(20);
		t.root.right=new tree(30);
		t.root.left.left=new tree(40);
		t.root.left.right=new tree(50);
		
		t.preorder(t.root);
		


	}

}
