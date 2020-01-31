class Node
{
    int key;
    Node left, right;

    public Node(int item)
    {
        key = item;
        left = right = null;
    }
}

class BinaryTree
{
    // Root of Binary Tree
    Node root;
    BinaryTree()
    {
        root = null;
    }

// Print the nodes of binary tree
  
    void print_Preorder(Node node)
    {
        if (node == null)
            return;

        /* Print data of node */
        System.out.print(node.key + " ");

        print_Preorder(node.left);

        print_Preorder(node.right);
    }
     
    void print_Preorder()  
	{   
	  print_Preorder(root); 
	}
}
class qstn12{
    // Driver method
    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(40);
        tree.root.left.right = new Node(50);
        
        System.out.println("Preorder traversal of binary tree is: ");
        tree.print_Preorder();
    }
}
