package leetcode;

public class CompareVersionNumbers {
	public int compareVersion(String version1, String version2) {
		if(version1 == null || version1.length() == 0 || version2 == null || version2.length() == 0) return 0;
		int n = Math.max(version1.length(), version2.length());
		String[] s1 = version1.split("\\.");
		String[] s2 = version2.split("\\.");
		for (int i = 0; i < n; i++) {
			int a = i <= version1.length() ? Integer.valueOf(s1[i]) : 0;
			int b = i <= version2.length() ? Integer.valueOf(s2[i]) : 0;
			if(a > b) return 1;
			else if(a < b) return -1;
		}
		return 0;
	}

	public static void main(String[] args) {
		CompareVersionNumbers compareVersionNumbers = new CompareVersionNumbers();
		compareVersionNumbers.compareVersion("01", "1");
	}
}
