package com.algorithms.dbs;

import java.util.Arrays;
import java.util.Scanner;

public class Keyboard {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputString = sc.next();
		String keyboardString = sc.next();
		sc.close();
		int[] distances = new int[keyboardString.length()];
		for (int i = 0; i < keyboardString.length(); i++) {
			distances[Character.getNumericValue(keyboardString.charAt(i)) - 1] = i;
		}
		System.out.println(Arrays.toString(distances));
		int time=0;
		int prevNumberPressed = Character.getNumericValue(inputString.charAt(0));
		for (int i = 1; i < inputString.length(); i++) {
			
			int numberPressed = Character.getNumericValue(inputString.charAt(i));
			if(prevNumberPressed==numberPressed){
				time+=0;
			}
			else
			{
			int ver= Math.abs(((int)distances[prevNumberPressed-1]/3)-((int)distances[numberPressed-1]/3));
			int horiz= Math.abs(distances[prevNumberPressed-1]%3-(distances[numberPressed-1]%3));
			time+=Math.max(ver, horiz);
			}
			
			prevNumberPressed=numberPressed;
		}
		System.out.println(time);

	}

}
