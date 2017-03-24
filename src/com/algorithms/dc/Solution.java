package com.algorithms.dc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] inputs = input.split(" ");
		long r = Integer.valueOf(inputs[0]);
		long c = Integer.valueOf(inputs[1]);
		long k = Integer.valueOf(inputs[2]);

		HashMap<Integer, List<Intervel>> intervelsMap = new HashMap<>();
		long numberOfCells = r * c;
		long occupiedCells = 0;

		for (long i = 0; i < k; i++) {
			String rowInput = sc.nextLine();
			String[] indInputs = rowInput.split(" ");
			Integer r1 = Integer.valueOf(indInputs[0]);
			Integer c1 = Integer.valueOf(indInputs[1]);
			Integer c2 = Integer.valueOf(indInputs[2]);
			List<Intervel> intervelList;
			if (intervelsMap.containsKey(r1)) {
				intervelList = intervelsMap.get(r1);
			} else {
				intervelList = new ArrayList<>();
			}
			intervelList.add(new Intervel(c1, c2));
			intervelsMap.put(r1, intervelList);

		}

		for (Integer i : intervelsMap.keySet()) {
			List<Intervel> list = intervelsMap.get(i);
			List<Intervel> mergedList = merge(list);
			for (Intervel intervel : mergedList) {
				occupiedCells += (intervel.end - intervel.start) + 1;
			}
		}

		System.out.println(numberOfCells - occupiedCells);
		sc.close();

	}

	private static List<Intervel> merge(List<Intervel> list) {
		Collections.sort(list, new Comparator<Intervel>() {
			@Override
			public int compare(Intervel a, Intervel b) {
				return a.start - b.start;
			}
		});
		ArrayList<Intervel> mergedIntervels = new ArrayList<Intervel>();
		int prevStart = list.get(0).start;
		int prevEnd = list.get(0).end;
		for (int i = 1; i < list.size(); i++) {
			Intervel current = list.get(i);
			if (current.start > prevEnd) {
				mergedIntervels.add(new Intervel(prevStart, prevEnd));
				prevStart = current.start;
				prevEnd = current.end;
			} else {
				prevEnd = Math.max(current.end, prevEnd);
			}
		}

		mergedIntervels.add(new Intervel(prevStart, prevEnd));
		return mergedIntervels;
	}

	static class Intervel {
		int start;
		int end;

		Intervel(int s, int e) {
			start = s;
			end = e;
		}

		public String toString() {
			return start + "->" + end;
		}
	}
}