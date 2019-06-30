import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PrintTree {
	ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		if (pRoot == null){
			return list;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(pRoot);
		int index = 0;
		int size = 1;
		while (!queue.isEmpty()){
			ArrayList<Integer> arrayList = new ArrayList<>();
			while (index < size){
				TreeNode treeNode = queue.poll();
				index++;
				arrayList.add(treeNode.val);
				if (treeNode.left!=null){
					queue.add(treeNode.left);
				}
				if (treeNode.right!=null){
					queue.add(treeNode.right);
				}
			}
			index = 0;
			size = queue.size();
			list.add(arrayList);
		}
		return list;
	}

}