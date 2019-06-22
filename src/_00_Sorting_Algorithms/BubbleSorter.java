package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter {
	public BubbleSorter() {
		type = "Bubble";
	}

	// 1. Use the bubble sorting algorithm to sort the array.
	// You can use display.updateDisplay() to show the current
	// progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		for (int j = 0; j < array.length - 1; j++) {
			for (int i = 0; i < array.length-1; i++) {
				if (array[i] > array[i + 1]) {
					swapTwoDigits(array, i, i+1);
					display.updateDisplay();
				}
				
			}
		}
	}

	public void swapTwoDigits(int[] array, int numOne, int numTwo) {
		int tempNum = array[numOne];
		array[numOne] = array[numTwo];
		array[numTwo] = tempNum;

	}

}
