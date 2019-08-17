public class SearchTreeToListNode {
	TreeNode head;
	TreeNode p;
	public TreeNode Convert(TreeNode pRootOfTree) {
		if(pRootOfTree == null) return null;
		recur(pRootOfTree);
		return head;
	}
	public void recur(TreeNode pRootOfTree){
		if(pRootOfTree == null) return;
		recur(pRootOfTree.left);
		if(head == null){
			head = pRootOfTree;
			p = pRootOfTree;
		}else{
			pRootOfTree.left = p;
			p.right = pRootOfTree;
			p = pRootOfTree;
		}
		recur(pRootOfTree.right);
	}
}
