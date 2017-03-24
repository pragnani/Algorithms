package com.algorithms.dc;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {

	public static void main(String[] args) {

		int size = 20;
		int[] unSortedArray = new int[size];
		Random random = new Random();
		for (int i = 0; i < size; i++) {
			unSortedArray[i] = random.nextInt(100);
		}
		System.out.println(Arrays.toString(unSortedArray));

		for (int i = 0; i < size; i++) {
			for (int j = i; j > 0; j--) {
				if (unSortedArray[j - 1] > unSortedArray[j]) {
					int temp = unSortedArray[j];
					unSortedArray[j] = unSortedArray[j - 1];
					unSortedArray[j - 1] = temp;
				}
			}

		}

		System.out.println(Arrays.toString(unSortedArray));

	}

}
