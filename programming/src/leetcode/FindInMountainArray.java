package leetcode;

interface MountainArray {
      public int get(int index);
      public int length();
  }

public class FindInMountainArray {
	public int findInMountainArray(int target, MountainArray mountainArr) {
		int n = mountainArr.length() - 1;
		int top = findTop(mountainArr, 0, n);
		int l = findLeft(mountainArr, 0, top, target);
		if (l != -1) return l;
		return findRight(mountainArr, top + 1, n, target);
	}

	public int findTop(MountainArray mountainArray, int left, int right){
		while (left < right){
			int mid = (left + right) >>> 1;
			if (mountainArray.get(mid) < mountainArray.get(mid)){
				left = mid + 1;
			}else {
			    right = mid;
			}
		}
		return left;
	}

	public int findLeft(MountainArray mountainArray, int left, int right, int temp){
		while (left < right){
			int mid = (left + right) >>> 1;
			if (mountainArray.get(mid) < temp){
				left = mid + 1;
			}else {
				right = mid;
			}
		}
		return mountainArray.get(left) == temp ? left : -1;
	}

	public int findRight(MountainArray mountainArray, int left, int right, int temp){
		while (left < right){
			int mid = (left + right) >>> 1;
			if (mountainArray.get(mid) > temp){
				left = mid + 1;
			}else {
				right = mid;
			}
		}
		return mountainArray.get(left) == temp ? left : -1;
	}
}
