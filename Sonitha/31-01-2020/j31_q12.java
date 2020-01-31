

class CreateNode//for inputting the values
{
	int key;
	CreateNode left,right;

	public CreateNode(int item) 
	{
		
		key = item;
		left = right = null;
	}
}
public class j31_q12 
{
	CreateNode root;
	public j31_q12() {
		root = null;
	}
	public void PrintReversal(CreateNode node)
	{
		if(node==null)
		{
			return;
		}
		
		System.out.println(node.key+"");
		PrintReversal(node.left);
		PrintReversal(node.right);
	}
	public void PrintReversal()
	{
		PrintReversal(root);
	}
	public static void main(String[] args) 
	{ 
	j31_q12 tree = new j31_q12();
	tree.root = new CreateNode(12);
	tree.root.left = new CreateNode(23);
	tree.root.right = new CreateNode(34);
	tree.root.left.left= new CreateNode(45);
	tree.root.left.right= new CreateNode(53);
	tree.root.right.left = new CreateNode(24);
	tree.root.right.right = new CreateNode(52);
	tree.PrintReversal();

	

	}

}
