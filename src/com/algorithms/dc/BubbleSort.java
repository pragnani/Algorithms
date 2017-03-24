package com.algorithms.dc;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

	public static void main(String[] args) {

		int size = 20;
		int[] unSortedArray = new int[size];
		Random random = new Random();
		for (int i = 0; i < size; i++) {
			unSortedArray[i] = random.nextInt(100);
		}
		System.out.println(Arrays.toString(unSortedArray));

		// for (int i = 0; i < size; i++) {
		// for (int j = i; j > 0; j--) {
		// if (unSortedArray[j - 1] > unSortedArray[j]) {
		// int temp = unSortedArray[j];
		// unSortedArray[j] = unSortedArray[j - 1];
		// unSortedArray[j - 1] = temp;
		// }
		// }
		//
		// }
		bubbleSort(unSortedArray);

		System.out.println(Arrays.toString(unSortedArray));

	}

	public static void bubbleSort(int[] values) {
		for (int pass = 0; pass < values.length; pass++) {
			for (int i = 1; i < (values.length - pass); i++) {
				if (values[i] < values[i-1]) {
					int temp = values[i];
					values[i] = values[i-1];
					values[i-1] = temp;
				}
			}
		}

	}
}
