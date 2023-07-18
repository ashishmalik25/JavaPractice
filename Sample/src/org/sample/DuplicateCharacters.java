package org.sample;
	
	
	import java.util.HashMap;
	import java.util.Map;

	public class DuplicateCharacters {
	    public static void main(String[] args) {
	        String str = "Hello World";

	        // Create a HashMap to store characters and their frequencies
	        Map<Character, Integer> charCountMap = new HashMap<>();

	        // Convert the string to lowercase (optional, for case-insensitive comparison)
	        str = str.toLowerCase();

	        // Iterate over each character in the string
	        for (char c : str.toCharArray()) {
	            // Check if the character is a letter or digit
	            if (Character.isLetterOrDigit(c)) {
	                // If the character already exists in the map, increment its count
	                if (charCountMap.containsKey(c)) {
	                    charCountMap.put(c, charCountMap.get(c) + 1);
	                } else {
	                    // If the character is encountered for the first time, add it to the map with a count of 1
	                    charCountMap.put(c, 1);
	                }
	            }
	        }

	        // Print the duplicate characters
	        System.out.println("Duplicate characters in the string:");
	        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
	            if (entry.getValue() > 1) {
	                System.out.println(entry.getKey() + " - Count: " + entry.getValue());
	            }
	        }
	    }
	}



