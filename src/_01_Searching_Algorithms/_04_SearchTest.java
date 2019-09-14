package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD

	@Test
	public void testLinearSearch() {
		// 1. use the assertEquals method to test your linear search method.
		String test1[] = { "turtle", "dog", "red", "Santa", "broccoli" };
		assertEquals(1, _00_LinearSearch.linearSearch(test1, "dog"));

		String test2[] = { "nail polish", "two million", "PURPLE", "purple" };
		assertEquals(3, _00_LinearSearch.linearSearch(test2, "purple"));
		
		String test3[] = { "fish", "oak tree", "OAK TREE"};
		assertEquals(2, _00_LinearSearch.linearSearch(test3, "OAK TREE"));
	}

	@Test
	public void testBinarySearch() {
		// 2. use the assertEquals method to test your binary search method.
		// remember that the array must be sorted
		int test1[] = { 1, 5, 8, 12, 18, 99, 100 };
		assertEquals(2, _01_BinarySearch.binarySearch(test1, 0, 6, 8));
		// searching for 8
		
		int test2[] = { 4, 7, 10, 459, 9444 };
		assertEquals(2, _01_BinarySearch.binarySearch(test2, 0, 4, 10));
		
		int test3[] = { 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		assertEquals(0, _01_BinarySearch.binarySearch(test3, 0, 12, 8));
		
	}

	@Test
	public void testInterpolationSearch() {
		// 3. use the assertEquals method to test your interpolation search method.
		// remember that the array must be sorted and evenly distributed
		int test1[] = { 5, 10, 15, 20, 25, 30, 35, 40, 45 };
		assertEquals(7, _02_InterpolationSearch.interpolationSearch(test1, 40));
		
		int test2[] = { 10, 12, 14, 16, 18};
		assertEquals(2, _02_InterpolationSearch.interpolationSearch(test2, 14));
		
		int test3[] = { 1, 2, 3, 4, 5, 6, 7 };
		assertEquals(5, _02_InterpolationSearch.interpolationSearch(test3, 6));
	}

	@Test
	public void testExponentialSearch() {
		int test1[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18 };
		assertEquals(8, _03_ExponentialSearch.exponentialSearch(test1, 8));

		int test2[] = { 4, 5, 10, 20, 482, 500 };
		assertEquals(0, _03_ExponentialSearch.exponentialSearch(test2, 4));
		// 4. use the assertEquals method to test your exponential search method.
		// remember that the array must be sorted
		
		int test3[] = { 99, 103, 200 };
		assertEquals(1, _03_ExponentialSearch.exponentialSearch(test3, 103));
	}
}
