package com.algorithms.sorting;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {

	public static void main(String[] args) {

		int size = 5;
		int[] unSortedArray = new int[size];

		Random random = new Random();
		for (int i = 0; i < size; i++) {
			unSortedArray[i] = random.nextInt(100);
		}
		System.out.println(Arrays.toString(unSortedArray));

		int[] auxArray = new int[unSortedArray.length];

		int low = 0;
		int high = unSortedArray.length - 1;
		mergeSort(unSortedArray, auxArray, low, high);

		System.out.println(Arrays.toString(unSortedArray));

	}

	public static void mergeSort(int[] values, int[] auxArray, int low, int high) {
		System.out.println(String.format(" merge sort Low %d,  High %d", low, high));
		if (high <= low){
			System.out.println("for debugging");
			return;
		}

		int mid = low + (high - low) / 2;
		mergeSort(values, auxArray, low, mid);
		mergeSort(values, auxArray, mid + 1, high);
		merge(values, auxArray, low, mid, high);
		
		System.out.println("Array Content After each Merge "+ Arrays.toString(values));
	}

	private static void merge(int[] values, int[] auxArray, int low, int mid, int high) {
		System.out.println("----Merge---");
		int i = low, j = mid + 1;
		

		for (int k = low; k <= high; k++) {
			auxArray[k] = values[k];
		}

		for (int k = low; k <= high; k++) {

			if (i > mid) {
				values[k] = auxArray[j++];
			} else if (j > high) {
				values[k] = auxArray[i++];
			}
			else if (auxArray[j] < auxArray[i]) {
					values[k] = auxArray[j++];
				} else {
					values[k] = auxArray[i++];
				}

		}

	}
}
