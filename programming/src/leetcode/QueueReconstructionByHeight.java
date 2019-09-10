package leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class QueueReconstructionByHeight {
	public int[][] reconstructQueue(int[][] people) {
		if(people == null || people.length == 0) return new int[][]{};
		Arrays.sort(people, (o1,o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o1[0]);
		List<int []> list = new LinkedList<>();
		for(int [] p : people){
			list.add(p[1], p);
		}
		return list.toArray(new int [0][]);
	}

	public static void main(String[] args) {
		QueueReconstructionByHeight queueReconstructionByHeight = new QueueReconstructionByHeight();
		//[[7,0],[4,4],[7,1],[5,0],[6,1],[5,2]]
		queueReconstructionByHeight.reconstructQueue(new int [][]{{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}});
	}
}
