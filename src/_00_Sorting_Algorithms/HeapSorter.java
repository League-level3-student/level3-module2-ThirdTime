package _00_Sorting_Algorithms;

public class HeapSorter extends Sorter {

	public HeapSorter() {
		type = "Heap";
	}
	
	//1. Since this sorting algorithm uses recursion, 
	//   we'll make a helper method called heapSort.
	//   Complete the steps in the heapSort method.
	//   You can use display.updateDisplay() to show the current
	//   progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		//8. create an integer called n and set it equal 
		//   to the length of the array
		int n = array.length;
		//9. make a for loop that starts half way between
		//   0 and n and counts down until it is less than 0.
		//   Inside this for loop, call the heapSort method with n and i
        for(int i = n/2; i >= 0; i--) {
        	heapSort(array, n, i, display);
        }
        //10. make a for loop that starts at n-1 
        //    and counts down until it is less than 0.
        for(int i = n-1; i >= 0; i--) {
        	//11. swap the array elements at 0 and i.
        	int tempInt = array[i];
        	array[i] = array[0];
        	array[0] = tempInt;
            //12. call the heapSort method with i and 0
        	heapSort(array, i, 0, display);
        }
	}
	
	public void heapSort(int[] array, int n, int i, SortingVisualizer display) {
		display.updateDisplay();
		//2. create an integer called largest and set it equal to i
		int largest = i;
		//3. create an integer called l and set it equal to 2 * i + 1
        int leftChild = 2 * i +1;
		//4. create an integer called r and set it equal to 2 * i + 2
        int rightChild = 2 * i + 2;
        //5. if l is less than n 
        if(leftChild<n && array[leftChild] > array[largest]) {
        //   and array element at l is greater than array element at largest
        //   then set largest equal to l
        	largest = leftChild;
        }
        //6. if r is less than n 
        if(rightChild < n && array[rightChild]> array[largest]) {
        //   and array element at r is greater than array element at largest
        //   then set largest equal to r
        	largest = rightChild;
        }
        //7. if largest is not equal to i
        if(largest!= i) {
        //   then swap the array elements at i and largest.
        	int swapStorage = array[i];
        	array[i] = array[largest];
        	array[largest] = swapStorage;
        //   Also, call the heapSort method with n and largest
        	heapSort(array, n, largest, display);
        }
	}

}
