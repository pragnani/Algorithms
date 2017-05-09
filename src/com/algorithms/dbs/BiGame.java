package com.algorithms.dbs;

import java.util.Scanner;

public class BiGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int left = sc.nextInt();
		int right = sc.nextInt();
		int limit = sc.nextInt();
		sc.close();
		int maxXor=0;
		for (int i = left; i < right; i++) {
			for (int j = right; j > left; j--) {
				int xor = i ^ j;
				if (xor <= limit) {
					if (xor == limit) {
						System.out.println(xor);
						return;
					} else {
						if(maxXor<xor){
							maxXor=xor;
						}
					}

				}

			}
		}
		System.out.println(maxXor);

	}

}
