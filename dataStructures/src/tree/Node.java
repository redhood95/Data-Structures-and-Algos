package tree;

public class Node {

	int val;
	Node left;
	Node right;
	public Node(int value)
    {
        
		this.val = value;
        this.left = this.right = null;
    }
	
	public int getInfo() {
	return val;	
		
	}
	
}
