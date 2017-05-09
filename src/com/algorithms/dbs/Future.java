package com.algorithms.dbs;

import java.util.Scanner;

public class Future {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int k = sc.nextInt();
		int p = sc.nextInt();
		sc.close();
		System.out.println(minNum(a, k, p));

	}
	static int minNum(int a, int k, int p){
		int noOfDays=1;
		int ta=a+p, tk = k;
		while(tk<=ta){
			noOfDays++;
			ta=a*noOfDays+1;
			tk=k*noOfDays;
		}
		return noOfDays;
		
	}

}
