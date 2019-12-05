
public class BinaryTree {

	Node root;

	public void addNode(int key, String name) {
		Node newNode = new Node(key, name);
		
		if(root == null) {
			root = newNode;
		} else {
			Node foucsNode = root;
			Node parent;
			
			while(true) {
				parent = foucsNode;
				if(key < foucsNode.key) {
					if(foucsNode.leftNode == null) {
						parent.leftNode = newNode;
						return;
					}
					
				} else {
					if(foucsNode.rightNode == null) {
						parent.rightNode = newNode;
						return;
					}
					
				}
			}
			
		}
		
		
	}

	public void inOrderTraverseTree(Node focusNode) {
		if(focusNode != null) {
			inOrderTraverseTree(focusNode.leftNode);
			System.out.println(focusNode);
			inOrderTraverseTree(focusNode.rightNode);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree();
		
		tree.addNode(50, "Boss");
		tree.addNode(25, "Vice pres");
		tree.addNode(10, "Office manager");
		tree.addNode(30, "Secretary");
		tree.addNode(75, "Salesperson");
		tree.addNode(85, "Sales Ecxec");
		
		tree.inOrderTraverseTree(tree.root);
		

	}

}

class Node {
	int key;
	String name;
	
	Node leftNode;
	Node rightNode;
	
	public Node(int key, String name) {
		// TODO Auto-generated constructor stub
		this.key = key;
		this.name = name;
	}
}
