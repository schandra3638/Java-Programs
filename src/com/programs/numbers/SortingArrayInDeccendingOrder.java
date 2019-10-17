package com.programs.numbers;
import java.util.Arrays;

public class SortingArrayInDeccendingOrder {
	public static void main(String[] args) {

		int arr[] = { 3, 5, 4, 2, 0, 1 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[i]) {

					int temp = arr[i];

					arr[i] = arr[j];

					arr[j] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(arr));

	}

}
