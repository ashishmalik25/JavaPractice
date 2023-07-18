package org.sample;


	
	public class NumberExtractor {
	    public static void main(String[] args) {
	        String str = "Sap1ent";
	        
	        // Remove all non-digit characters from the string
	        String numbers = str.replaceAll("\\D", "");
	        
	        // Print the extracted numbers
	        System.out.println("Extracted numbers: " + numbers);
	    }
	}



