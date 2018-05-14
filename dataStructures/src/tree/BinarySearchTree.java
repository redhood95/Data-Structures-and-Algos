package tree;

public class BinarySearchTree {
	
Node root;


public void inorder(Node root) {
	
	if(root != null) {
		
		inorder(root.left);
		System.out.println(root.getInfo());
		inorder(root.right);
	}
}

public void preorder(Node root) {
	
	if(root != null) {
		System.out.println(root.getInfo());
		preorder(root.left);
		preorder(root.right);
	
}}

public void postorder(Node root) {
	if(root != null) {
		preorder(root.left);
		preorder(root.right);
		System.out.println(root.getInfo());
	
	
	}
}

public static void main(String[] args) {
     BinarySearchTree Tree = new BinarySearchTree();

	      
     
            Tree.root = new Node(1);
            Tree.root.left = new Node(2);
            Tree.root.right = new Node(3);
            Tree.root.left.left = new Node(4);
            Tree.root.left.right = new Node(5);
    
            System.out.println("the inorder traverval of the tree is");
            Tree.inorder(Tree.root);
            System.out.println("the preorder traverval of the tree is");
            Tree.preorder(Tree.root);
            System.out.println("the postorder traverval of the tree is");
            Tree.postorder(Tree.root);

	}
	


}





	
	
	
	
	
	

