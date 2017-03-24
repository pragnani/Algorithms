package com.algorithms.dc;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {

	public static void main(String[] args) {

		int size = 20;
		int[] unSortedArray = new int[size];
		Random random = new Random();
		for (int i = 0; i < size; i++) {
			unSortedArray[i] = random.nextInt(100);
		}
		System.out.println(Arrays.toString(unSortedArray));

		int low = 0;
		int high = unSortedArray.length - 1;
		int[] aux = new int[unSortedArray.length];
		for (int i = 0; i < unSortedArray.length; i++) {
			aux[i] = unSortedArray[i];
		}
		mergesort(unSortedArray, aux, low, high);

	}

	private static void mergesort(int[] unSortedArray, int[] aux, int low, int high) {

		if (low < high) {
			int mid = low + (high - low / 2);

			mergesort(unSortedArray, aux, low, mid);
			mergesort(unSortedArray, aux, mid + 1, high);
			merge(unSortedArray, aux, low, mid, high);
		}
	}

	private static void merge(int[] unSortedArray, int[] aux, int low, int mid, int high) {

		int i = low;
		int j = mid;
		int k = low;

		while (i <= j && j < high) {
			if (aux[i] > aux[j]) {
				unSortedArray[k] = aux[j];
				j++;
			} else {
				unSortedArray[k] = aux[i];
				i++;
			}
			k++;
		}

	}

}
