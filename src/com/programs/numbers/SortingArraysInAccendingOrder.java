package com.programs.numbers;
import java.util.Arrays;

public class SortingArraysInAccendingOrder {
	public static void main(String[] args) {

		int arr2[] = { 1, 5, 4, 3, 2, 0 };

		for (int i = 0; i < arr2.length; i++) {

			for (int j = i + 1; j < arr2.length; j++) {

				if (arr2[j] < arr2[i]) {

					int temp = arr2[j];

					int temp2 = arr2[i];

					arr2[i] = temp;
					arr2[j] = temp2;
				}
			}
		}

		System.out.println(Arrays.toString(arr2));
	}

}
