package org.sample;


	
	import java.util.Arrays;

	public class AlphabeticalSort {
	    public static void main(String[] args) {
	        String str = "My name is Rajat";

	        // Split the string into words
	        String[] words = str.split(" ");

	        // Sort the words alphabetically
	        Arrays.sort(words);

	        // Print the sorted words
	        System.out.println("Sorted string:");
	        for (String word : words) {
	            System.out.print(word + " ");
	        }
	    }
	}


