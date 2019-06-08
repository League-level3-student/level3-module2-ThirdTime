package _00_Sorting_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _01_SwappingDigits {

	@Test
	void swapArrayOfTwoTest() {
		int[] x = { 5, 6 };
		int[] y = { 6, 5 };
		swapArrayOfTwo(x);
		assertArrayEquals(y, x);
	}

	@Test
	void sortIntArrayTest() {
		int[] z = { 7, 3, 5, 9, 2 };
		int[] q = { 2, 3, 5, 7, 9 };
		sortIntArray(z);
		assertArrayEquals(q, z);
	}

	@Test
	void findMiddleTest() {
		int[] m = { 7, 3, 9, 5, 2 };
		assertEquals(5, findMiddle(m));
		int[] n = { 28, 63, 1, 52, 7, 6 };
		assertEquals(28, findMiddle(n));
	}

	// 1. Complete the method so that the first two elements of the array are
	// swapped
	public static void swapArrayOfTwo(int[] arr) {
		int digitOne = arr[0];
		arr[0] = arr[1];
		arr[1] = digitOne;
	}

	// 2. Complete the method so that it sorts the array using a bubble sort.
	// Iterate through the array and when you find two elements that are out
	// of order, swap them. Repeat this until the array is in order.
	public static void sortIntArray(int[] arr) {
		int tempOldDigit = 0;
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					tempOldDigit = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = tempOldDigit;
				}
			}
		}
	}

	// 3. Complete the method so that it finds the middle number in the array.
	// *Hint* it helps to sort it first.
	// *Double Hint* Use the method you already wrote in step 2 to sort it
	public static int findMiddle(int[] arr) {
		int tempOldDigit = 0;
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					tempOldDigit = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = tempOldDigit;
				}
			}
		}
		return arr[arr.length / 2];
	}
}
