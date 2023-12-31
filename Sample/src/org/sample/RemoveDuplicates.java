package org.sample;


	
	
	import java.util.Arrays;
	import java.util.HashSet;

	public class RemoveDuplicates {
	    public static int[] removeDuplicates(int[] numbers) {
	        HashSet<Integer> uniqueNumbers = new HashSet<>();
	        for (int number : numbers) {
	            uniqueNumbers.add(number);
	        }
	        int[] result = new int[uniqueNumbers.size()];
	        int index = 0;
	        for (int number : uniqueNumbers) {
	            result[index++] = number;
	        }
	        return result;
	    }

	    public static void main(String[] args) {
	        int[] numbers = {1, 2, 3, 4, 2, 3, 5};
	        int[] uniqueNumbers = removeDuplicates(numbers);
	        System.out.println("Array with duplicates removed: " + Arrays.toString(uniqueNumbers));
	    }
	}


