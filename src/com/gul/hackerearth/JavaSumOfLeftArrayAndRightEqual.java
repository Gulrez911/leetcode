package com.gul.hackerearth;

public class JavaSumOfLeftArrayAndRightEqual {
	public static void main(String[] args) {

		int arr[] = { 2, 3, 4, 1, 4, 5 };
		int size = arr.length;

		char a = 'a';
		System.out.println((int) a);

	}

	static int findElement(int arr[], int size) {

//		int right_sum = 0, left_sum = 0;
//
//		// Computing right_sum
//		for (int i = 1; i < size; i++)
//			right_sum += arr[i];
//
//		// Checking the point of partition
//		// i.e. left_Sum == right_sum
//		for (int i = 0, j = 1; j < size; i++, j++) {
//			right_sum -= arr[j];
//			left_sum += arr[i];
//
//			if (left_sum == right_sum)
//				return arr[i + 1];
//		}
//
//		return -1;

		int temp = 0, temp2 = 0, s = 0;
		for (int i = 0; i < arr.length; i++) {

			temp += arr[i];
			System.out.println();
			for (int j = i + 2; j < arr.length; j++) {
				temp2 += arr[j];
			}

			if (temp == temp2) {
				System.out.println(">>>>> " + i + 1);
				s = i + 1;

//				s = arr[i + 1];
			}
			temp2 = 0;
		}

		return s;
	}
}
