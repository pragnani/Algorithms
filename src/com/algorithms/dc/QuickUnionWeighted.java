package com.algorithms.dc;

public class QuickUnionWeighted {
	int[] root;
	int[] sizes;

	public QuickUnionWeighted(int n) {
		root = new int[n];
		sizes = new int[n];
		for (int i = 0; i < 10; i++) {
			root[i] = i;
			sizes[i] = 1;
		}
	}

	private int root(int i) {
		while (i != root[i]) {
			root[i] = root[root[i]];
			i = root[i];
		}
		return i;
	}

	public boolean connected(int i, int j) {
		return root(i) == root(j);

	}

	public void union(int i, int j) {
		int p= root[i];
		int q= root[j];
		if (sizes[p] < sizes[q]) {
			root[i] = q;
			sizes[q] += sizes[p];
		} else {
			root[j] = p;
			sizes[p] += sizes[q];
		}
	}

}
