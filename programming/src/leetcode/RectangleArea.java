package leetcode;

public class RectangleArea {
	public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
		int lx = Math.max(A, E);
		int ly = Math.max(B, F);
		int rx = Math.min(C, G);
		int ry = Math.min(D, H);
		int x = (C - A) * (D - B);
		int y = (G - E) * (H - F);
		int z = (rx - lx) * (ry - ly);
		if(C <= E || A >= G || D <= F || H <= B) return x + y;
		else return x - z + y;
	}
}
