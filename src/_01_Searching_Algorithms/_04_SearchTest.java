package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String test1 [] = {"turtle", "dog", "red", "Santa", "broccoli"};
		assertEquals(1, _00_LinearSearch.linearSearch(test1, "dog"));
		
		String test2 [] = {"nail polish", "two million", "PURPLE", "purple"};
		assertEquals(3, _00_LinearSearch.linearSearch(test2, "purple"));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int test1 [] = {1, 5, 8, 12, 18, 99, 100};
		assertEquals(2, _01_BinarySearch.binarySearch(test1, 0, 6, 8));
		//searching for 8
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int test1 [] = {5, 10, 15, 20, 25, 30, 35, 40, 45};
		assertEquals(7, _02_InterpolationSearch.interpolationSearch(test1, 40));
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
	}
}
