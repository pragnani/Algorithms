package com.algorithms.dc;

public class QuickUnion {
	int[] roots;

	public QuickUnion(int n) {
		roots = new int[n];
		for (int i = 0; i < 10; i++) {
			roots[i] = i;
		}
	}
	private int root(int i){
		while(i!=roots[i]){
			i=roots[i];
		}
		return i;
	}

	public boolean connected(int i, int j) {
		return root(i) == root(j);

	}

	public void union(int i, int j) {
		roots[j]=roots[i];
	}

}
