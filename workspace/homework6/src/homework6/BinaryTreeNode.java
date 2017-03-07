package homework6;


public interface BinaryTreeNode<T> {
	

		public void SetLeft(BinaryTreeNode<T> left);
		
		public void SetRight(BinaryTreeNode<T> right);
		
		public void SetParent(BinaryTreeNode<T> parent);
		
		public void SetValue(T value);
		
		public BinaryTreeNode<T> GetLeft();
		
		public BinaryTreeNode<T> GetRight();
		
		public BinaryTreeNode<T> GetParent();
		
		public T GetValue();
		
		/*parent node, left node, right node and the
		value of the node.
		*/
		
	
}
