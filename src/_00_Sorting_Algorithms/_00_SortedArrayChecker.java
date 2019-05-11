package _00_Sorting_Algorithms;

public class _00_SortedArrayChecker {
	//1. Write a static method called intArraySorted. 
	//   This method takes in an array of integers
	//   and it returns a boolean.
	//   The method returns true if the integer
	//   array is in ascending order and false otherwise
	protected static boolean intArraySorted(int integerList[]) {
		for(int i = 0; i < integerList.length-1;i++) {
			if(integerList[i] > integerList[i+1]) {
				return false;
			}
		}
		return true;
	
	}
	
	//2. Write a static method called doubleArraySorted. 
	//   This method takes in an array of doubles
	//   and it returns a boolean.
	//   The method returns true if the double
	//   array is in ascending order and false otherwise
	protected static boolean doubleArraySorted(double[] doubleList) {
		for(int i = 0; i < doubleList.length-1;i++) {
			if(doubleList[i] > doubleList[i+1]) {
				return false;
			}
		}
		return true;
	}

	
	//3. Write a static method called charArraySorted. 
	//   This method takes in an array of characters
	//   and it returns a boolean.
	//   The method returns true if the character
	//   array is in alphabetical order and false otherwise
	//   (You can compare characters just like integers)
	protected static boolean charArraySorted(char[] characterList) {
		for(int i = 0; i < characterList.length-1;i++) {
			if(characterList[i] > characterList[i+1]) {
				return false;
			}
		}
		return true;
	}	

	
	//4. Write a static method called stringArraySorted. 
	//   This method takes in an array of Strings
	//   and it returns a boolean.
	//   The method returns true if the String
	//   array is in alphabetical order and false otherwise
	//   (Use the compareTo(String) method)
	protected static boolean stringArraySorted(String[] stringList) {
		for(int i = 0; i < stringList.length-1;i++) {
			char[] stringAsChar1 = stringList[i].toCharArray();
			char [] stringAsChar2 = stringList[i+1].toCharArray();
			if(stringAsChar1[1] > stringAsChar2[1]) {
				return false;
			}
		}
		return true;
	}
}

