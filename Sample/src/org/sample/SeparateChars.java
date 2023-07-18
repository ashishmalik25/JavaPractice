package org.sample;
	
	import java.util.*;

	public class SeparateChars {
	    public static void main(String[] args) {
	        String input = "abc#$#23asc";
	        StringBuilder chars = new StringBuilder();
	        StringBuilder splChars = new StringBuilder();
	        StringBuilder numerics = new StringBuilder();

	        // Iterate over each character in the input string
	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);

	            if (Character.isLetter(ch)) {
	                chars.append(ch);
	            } else if (Character.isDigit(ch)) {
	                numerics.append(ch);
	            } else {
	                splChars.append(ch);
	            }
	        }

	        // Print the categorized strings
	        System.out.println("Chars: " + chars.toString());
	        System.out.println("SplChars: " + splChars.toString());
	        System.out.println("Numerics: " + numerics.toString());
	    }
	}



