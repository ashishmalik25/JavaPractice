package org.sample;


	public class FirstNonRepeatingChar {
	    public static char findFirstNonRepeatingChar(String str) {
	        // Create a frequency array to store the count of each character
	        int[] frequency = new int[256]; // Assuming ASCII characters

	        // Iterate through the string to calculate the character frequencies
	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	            frequency[c]++;
	        }

	        // Iterate through the string again to find the first non-repeating character
	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	            if (frequency[c] == 1) {
	                return c; // Found the first non-repeating character
	            }
	        }

	        return '\0'; // Return '\0' if no non-repeating character is found
	    }

	    public static void main(String[] args) {
	        String str = "India";
	        char firstNonRepeatingChar = findFirstNonRepeatingChar(str);
	        System.out.println("First non-repeating character: " + firstNonRepeatingChar);
	    }
	}



