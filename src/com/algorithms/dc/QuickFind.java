package com.algorithms.dc;

public class QuickFind {
	int[] ids;

	public QuickFind(int n) {
		ids = new int[n];
		for (int i = 0; i < 10; i++) {
			ids[i] = i;
		}
	}

	public boolean connected(int i, int j) {
		return ids[i] == ids[j];

	}

	public void union(int i, int j) {
		int p = ids[i];
		int q = ids[j];
		for (int k = 0; k < ids.length; k++) {
			if (ids[k] == p) {
				ids[k] = q;
			}

		}
	}

}
