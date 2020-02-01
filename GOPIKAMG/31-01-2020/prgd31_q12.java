package project1;
class Node
{
	int key;
	Node left;
	Node right;
	public Node(int item)
	{
		key=item;
		left=right=null;
		
	}
}
class BinaryTree
{
	Node root;
	BinaryTree()
	{
		root=null;
	}
	void print_Preorder(Node node)
	{
		if(node==null)
			return;
		System.out.println(node.key + " ");
		print_Preorder(node.left);
		print_Preorder(node.right);
	}
	void print_Preorder()
	{
		print_Preorder(root);
	}
}
public class prgd31_q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       BinaryTree tree =new BinaryTree();
       tree.root=new Node(10);
       tree.root.left=new Node(20);
       tree.root.right=new Node(30);
       tree.root.left.left=new Node(40);
       tree.root.left.right=new Node(50);
       
       System.out.println("Preorder traversal of binary tree is "); 
       tree.print_Preorder(); 
       
	}

}
