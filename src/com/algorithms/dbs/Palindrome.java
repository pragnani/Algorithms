package com.algorithms.dbs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String inputString = sc.next();
		sc.close();
		int n = inputString.length();
		int[][] values = new int[n][n];
		int i, j;

		for (i = 0; i < n; i++) {
			values[i][i] = 1;
		}
		for(i = n - 2; i >= 0; i--) {
	        for(j = i + 1; j < n; j++) {
	 
	            if(inputString.charAt(i) == inputString.charAt(j)) {
	                values[i][j] = 2 + values[i + 1][j - 1];
	            }
	 
	            else {
	                values[i][j] = Math.max(values[i + 1][j], values[i][j - 1]);
	            }
	        }
	    }
	 
	 
		int m=0;
	 
		for(i=1;i<n;i++)
		{
			int temp=values[0][i-1]*values[i][n-1];
			if(temp>m){
				m=temp;
	        }
		}
		System.out.println(m);


	}

}
