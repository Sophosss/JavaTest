
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class ToWork {
	ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		if (pRoot == null){
			return list;
		}
		boolean temp = true;
		Queue<TreeNode> queue = new LinkedList<>();
		Stack<TreeNode> stack = new Stack<>();
		if (temp){
			queue.add(pRoot);
			temp = false;
		}else {
			stack.add(pRoot);
			temp = true;
		}
		int index = 0;
		int size = 1;
		while (!queue.isEmpty()||!stack.isEmpty()) {
			while (temp == false && !queue.isEmpty()) {
				ArrayList<Integer> arrayList = new ArrayList<>();
				while (index < size) {
					TreeNode treeNode = queue.poll();
					index++;
					arrayList.add(treeNode.val);

					if (treeNode.left != null) {
						stack.push(treeNode.left);
					}
					if (treeNode.right != null) {
						stack.push(treeNode.right);
					}
				}
				index = 0;
				size = stack.size();
				list.add(arrayList);
				temp = true;
			}
			while (temp == true && !stack.isEmpty()) {
				ArrayList<Integer> arrayList2 = new ArrayList<>();
				Stack<TreeNode> stack2 = new Stack<>();
				while (index < size) {
					TreeNode treeNode = stack.pop();
					stack2.push(treeNode);
					index++;
					arrayList2.add(treeNode.val);
				}
				while (!stack2.isEmpty()){
					TreeNode treeNode = stack2.pop();
					if (treeNode.left != null) {
						queue.add(treeNode.left);
					}
					if (treeNode.right != null) {
						queue.add(treeNode.right);
					}
				}
				index = 0;
				size = queue.size();
				list.add(arrayList2);
				temp = false;
			}
		}
		return list;
	}

}
