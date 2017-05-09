package com.algorithms.dbs;

import java.util.Scanner;

public class ArrangeCoins {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long[] coins = new long[n];
		for (int i = 0; i < n; i++) {
			if (sc.hasNext()) {
				coins[i] = sc.nextLong();
			}
		}
		sc.close();
		arrangeCoins(coins);

	}

	static void arrangeCoins(long[] coins) {
		for (long coin : coins) {
			double variable = Math.sqrt(1 + 8 * coin);
			if (!((variable == Math.floor(variable)) && !Double.isInfinite(variable))) {
				System.out.println(((int) variable - 1) / 2);
			}

		}

	}

}
