package org.sample;

	
	import java.util.ArrayList;
	import java.util.HashSet;

	public class CommonElementsFinder {
		
	    public static void main(String[] args) {
	        // Sample array lists
	        ArrayList<Integer> list1 = new ArrayList<>();
	        list1.add(1);
	        list1.add(2);
	        list1.add(3);
	        list1.add(4);

	        ArrayList<Integer> list2 = new ArrayList<>();
	        list2.add(3);
	        list2.add(4);
	        list2.add(5);
	        list2.add(6);

	        // Find common elements
	        ArrayList<Integer> commonElements = findCommonElements(list1, list2);

	        // Display common elements
	        System.out.println("Common Elements: " + commonElements);
	    }

	    public static ArrayList<Integer> findCommonElements(ArrayList<Integer> list1, ArrayList<Integer> list2) {
	        // Create a HashSet to store unique elements from the first list
	        HashSet<Integer> set = new HashSet<>(list1);

	        // Create a new ArrayList to store common elements
	        ArrayList<Integer> commonElements = new ArrayList<>();

	        // Iterate over the second list
	        for (Integer num : list2) {
	            // Check if the element exists in the set
	            if (set.contains(num)) {
	                commonElements.add(num);
	            }
	        }

	        return commonElements;
	    }
	}


